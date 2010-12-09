package com.amazon.aws.demo.sns;

import java.util.List;

import com.amazon.aws.demo.AlertActivity;
import com.amazon.aws.demo.R;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class SnsPublish extends AlertActivity{
	
	protected Handler mHandler;
	protected Spinner topicSpinner;
	protected ArrayAdapter<String> topicListAdapter;
	protected EditText messageInput;
	protected Button submitButton;
	protected List<String> topicArns;
		
	private Runnable postResults = new Runnable() {
		@Override
		public void run(){
			updateUi();
		}
	};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sns_publish);
        topicSpinner = (Spinner) findViewById(R.id.sns_pub_topic_spinner);
        messageInput = (EditText) findViewById(R.id.sns_pub_message_input);
        submitButton = (Button) findViewById(R.id.sns_pub_submit_button);
        mHandler = new Handler();
        getTopicArn();
    }
    
    private void getTopicArn(){
    	Thread t = new Thread(){
    		@Override
    		public void run(){
    			try {
	    			topicArns = SimpleNotification.getTopicNames();
	    			mHandler.post(postResults);
    			} catch(Throwable e){
    				setStackAndPost(e);
    			}
    		}
    	};
    	t.start();
    }
    
    private void wireSubmitButton(){
    	submitButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				topicSpinner.setVisibility(View.INVISIBLE);
				messageInput.setVisibility(View.INVISIBLE);
				try{
					SimpleNotification.publish(topicSpinner.getSelectedItem().toString(), messageInput.getText().toString());
					finish();
				} catch(Throwable e){
    				setStackAndPost(e);
				}
			}
		});
   }
    
   private void updateUi(){
      	topicListAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item , topicArns);
    	topicSpinner.setAdapter(topicListAdapter);
        wireSubmitButton();
    }
}
