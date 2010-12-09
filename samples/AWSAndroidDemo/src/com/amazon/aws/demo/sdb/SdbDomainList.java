package com.amazon.aws.demo.sdb;

import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import com.amazon.aws.demo.CustomListActivity;


public class SdbDomainList extends CustomListActivity {

	protected List<String> domainNameList;
	
	private static final String SUCCESS = "Domain List";
	public static final int NUM_DOMAINS = 5;
	
	private final Runnable postResults = new Runnable() {
		@Override
		public void run(){
			updateUi(domainNameList, SUCCESS);
		}
	};
	
	private final Runnable postMore = new Runnable() {
		@Override
		public void run(){
			updateList(domainNameList);
		}
	};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enablePagination();
        startPopulateList();
    }
    
    @Override
    protected void obtainListItems(){
		domainNameList = SimpleDB.getDomainNames(NUM_DOMAINS);
        getHandler().post(postResults);
    }
    
    @Override
    protected void obtainMoreItems(){
		Log.e("DOMAIN", "buttonPressed");
    	domainNameList = SimpleDB.getMoreDomainNames();
    	for(String domain: domainNameList)
    		Log.e("DOMAIN", domain);
    	getHandler().post(postMore);
    }
    
   	@Override	
	protected void wireOnListClick(){
		getItemList().setOnItemClickListener(new OnItemClickListener() {
		    @Override
		    public void onItemClick(AdapterView<?> list, View view, int position, long id) {
			    	final String domainName = ((TextView)view).getText().toString();
					Intent bucketViewIntent = new Intent(SdbDomainList.this, SdbItemList.class);
					bucketViewIntent.putExtra( SimpleDB.DOMAIN_NAME, domainName );
					startActivity(bucketViewIntent);
		    }
		 });
	}
}
