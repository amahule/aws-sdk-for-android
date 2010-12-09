package com.amazon.aws.demo.sqs;

import java.util.List;

import com.amazon.aws.demo.CustomListActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class SqsQueueList extends CustomListActivity {
	
	protected List<String> queueListArray;
	
	
	private static final String SUCCESS = "Queue List";
	
	private Runnable postResults = new Runnable(){
		@Override
		public void run(){
			updateUi(queueListArray, SUCCESS);
		}
	};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startPopulateList();
    }
    
    protected void obtainListItems(){
		queueListArray = SimpleQueue.getQueueUrls();
		getHandler().post(postResults);
    }
    
	protected void wireOnListClick(){
		getItemList().setOnItemClickListener(new OnItemClickListener() {
		    @Override
		    public void onItemClick(AdapterView<?> list, View view, int position, long id) {
		    	final String queueUrl = ((TextView)view).getText().toString();
				Intent sqsRecieveIntent = new Intent(SqsQueueList.this, SqsRecieveMessages.class);
				sqsRecieveIntent.putExtra( SimpleQueue.QUEUE_URL, queueUrl );
				startActivity(sqsRecieveIntent);	    
			}
		 });
	}

}
