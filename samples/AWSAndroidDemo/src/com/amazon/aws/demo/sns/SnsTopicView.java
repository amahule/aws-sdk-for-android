package com.amazon.aws.demo.sns;

import java.util.List;

import com.amazon.aws.demo.CustomListActivity;

import android.os.Bundle;


public class SnsTopicView extends CustomListActivity{
	
	protected String topicArn;
	protected List<String> subscriptionListArray;
	
	private static final String SUCCESS = "Subscription List";

	private Runnable postResults = new Runnable(){
		@Override
		public void run(){
			updateUi(subscriptionListArray, SUCCESS);
		}
	};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = this.getIntent().getExtras();
        topicArn = extras.getString(SimpleNotification.TOPIC_ARN);
        startPopulateList();

    }
    
    protected void obtainListItems(){
    	if(topicArn.equals(""))
    		subscriptionListArray = SimpleNotification.getSubscriptionNames();
    	else
    		subscriptionListArray = SimpleNotification.getSubscriptionNamesByTopic(topicArn);

		getHandler().post(postResults);
    }

}
