package com.amazon.aws.demo;

import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public abstract class CustomListActivity extends AlertActivity {
	
	protected Handler mHandler;
	protected ListView itemList;
	protected TextView loadingText;
	protected Button moreButton;
	protected ArrayAdapter<String> itemListAdapter;
		
	public static final int LEFT = 0;
	public static final int CENTER = 1;
		
	private final Runnable postWaitingForMore = new Runnable() {
		@Override
		public void run(){
			moreButton.setOnClickListener(null);
		}
	};
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);
        mHandler = new Handler();
        itemList = (ListView) findViewById(R.id.item_list_view);
        loadingText = (TextView) findViewById(R.id.item_list_loading_text);
        moreButton = (Button) findViewById(R.id.item_list_more_button);
    }
    	
	protected void updateUi(String[] list, String successMessage){
		updateUi(list, successMessage, CENTER);
    }
    
	protected void updateUi(List<String> list, String successMessage){
		updateUi(list, successMessage, CENTER);
    }
	
	protected void updateUi(List<String> list, String successMessage, int justify){
    	loadingText.setText(successMessage);
    	loadingText.setTextSize(16);
    	if(justify == LEFT){
    		itemListAdapter = new ArrayAdapter<String>(this, R.layout.row_left, list);
    	} else if(justify == CENTER){
    		itemListAdapter = new ArrayAdapter<String>(this, R.layout.row, list);
    	}
        itemList.setAdapter(itemListAdapter);
    	itemListAdapter.notifyDataSetChanged();
		wireOnListClick();
    }
	
	protected void updateUi(String[] list, String successMessage, int justify){
    	loadingText.setText(successMessage);
    	loadingText.setTextSize(16);
    	if(justify == LEFT){
    		itemListAdapter = new ArrayAdapter<String>(this, R.layout.row_left);
    	} else if(justify == CENTER){
    		itemListAdapter = new ArrayAdapter<String>(this, R.layout.row);
    	}
        itemList.setAdapter(itemListAdapter);
        for(String item : list){
        	itemListAdapter.add(item);
        }
    	itemListAdapter.notifyDataSetChanged();
		wireOnListClick();
    }
	
    protected void updateList(String[] itemNameList){
    	for(String item: itemNameList){
    		itemListAdapter.add(item);
    	}
    	itemListAdapter.notifyDataSetChanged();
		wireOnListClick();
    }
    
    protected void updateList(List<String> itemNameList){
    	if(itemNameList.size() == 0){
    		disablePagination();
    	} else {
    		enablePagination();
	    	for(String item: itemNameList){
	    		itemListAdapter.add(item);
	    	}
	    	itemListAdapter.notifyDataSetChanged();
			wireOnListClick();
    	}
    }
    
    
    protected void startPopulateList(){
    	Thread t = new Thread() {
    		@Override
    		public void run(){
    			try{
    				obtainListItems();
    			} catch(Throwable e){
    				setStackAndPost(e);
    			}
    		}
    	};
    	t.start();
    }
    
    protected void getMoreItems(){
    	Thread t = new Thread() {
    		@Override
    		public void run(){
    			try{
    				mHandler.post(postWaitingForMore);
    				obtainMoreItems();
    			} catch(Throwable e){
    				setStackAndPost(e);
    			}
    	}
    };
    	t.start();
    }
    
    protected abstract void obtainListItems();
    
    protected void obtainMoreItems(){
    	return;
    }
	
    public Handler getHandler(){
    	return mHandler;
    }
    
	public ListView getItemList(){
		return itemList;
	}
	
	public void enablePagination(){
		moreButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				getMoreItems();
			}
		});
		moreButton.setVisibility(View.VISIBLE);
	}
	
	public void disablePagination(){
		moreButton.setOnClickListener(null);
		moreButton.setVisibility(View.INVISIBLE);
	}
    
    protected void wireOnListClick(){
    	return;
    }
    
    
}
