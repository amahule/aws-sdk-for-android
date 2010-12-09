package com.amazon.aws.demo.sns;

import java.util.List;

import com.amazon.aws.demo.CustomListActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.AdapterView.OnItemClickListener;

public class SnsTopicList extends CustomListActivity{
	
	protected List<String> topicNameList;
	
	private static final String SUCCESS = "Topic List";
	
	private final Runnable postResults = new Runnable() {
		@Override
		public void run(){
			updateUi(topicNameList, SUCCESS);
		}
	};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startPopulateList();
    }
    
    protected void obtainListItems(){
		topicNameList = SimpleNotification.getTopicNames();
        getHandler().post(postResults);
    }
    
	protected void wireOnListClick(){
		getItemList().setOnItemClickListener(new OnItemClickListener() {
		    @Override
		    public void onItemClick(AdapterView<?> list, View view, int position, long id) {
		    	final String topicArn = topicNameList.get(position);
				Intent snsTopicIntent = new Intent(SnsTopicList.this, SnsTopicView.class);
				snsTopicIntent.putExtra( SimpleNotification.TOPIC_ARN, topicArn );
				startActivity(snsTopicIntent);
		    }
		 });
	}
    		
}
