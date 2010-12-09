package com.amazon.aws.demo.sqs;

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

public class SqsSendMessages extends AlertActivity{
	
	protected Handler mHandler;
	protected Spinner queueSpinner;
	protected ArrayAdapter<String> queueListAdapter;
	protected EditText messageInput;
	protected Button submitButton;
	protected List<String> queueUrls;
	
	private Runnable postResults = new Runnable() {
		@Override
		public void run(){
			updateUi();
		}
	};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sqs_send);
        queueSpinner = (Spinner) findViewById(R.id.sqs_send_queue_spinner);
        messageInput = (EditText) findViewById(R.id.sqs_send_message_input);
        submitButton = (Button) findViewById(R.id.sqs_send_submit_button);
        mHandler = new Handler();
        getTopicArn();
    }
    
    private void getTopicArn(){
    	Thread t = new Thread(){
    		@Override
    		public void run(){
    			try {
	    			queueUrls = SimpleQueue.getQueueUrls();
	    			mHandler.post(postResults);
    			} catch (Throwable e){
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
				queueSpinner.setVisibility(View.INVISIBLE);
				messageInput.setVisibility(View.INVISIBLE);
				try {
					SimpleQueue.sendMessage(queueSpinner.getSelectedItem().toString(), messageInput.getText().toString());
					finish();
				} catch (Throwable e) {
    				setStackAndPost(e);
				}
			}
		});
   }
    
   private void updateUi(){
      	queueListAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item , queueUrls);
    	queueSpinner.setAdapter(queueListAdapter);
        wireSubmitButton();
    }
}
