package com.amazon.aws.demo.sns;

import com.amazon.aws.demo.AlertActivity;
import com.amazon.aws.demo.R;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SnsCreateTopic extends AlertActivity {
	
	protected Button submitButton;
	protected EditText topicName;
	protected TextView introText;
	protected Handler mHandler;
		
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_item);
        submitButton = (Button) findViewById(R.id.create_it_submit_button);
        topicName = (EditText) findViewById(R.id.create_it_input_field);
        introText = (TextView) findViewById(R.id.create_it_intro_text);
        mHandler = new Handler();
        introText.setText("Enter Topic Name:");
        wireSubmitButton();
    }
	
	public void wireSubmitButton(){
		submitButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				topicName.setVisibility(View.INVISIBLE);
				try {
					SimpleNotification.createTopic(topicName.getText().toString());
					finish();
				} catch(Throwable e){
    				setStackAndPost(e);
				}
			}
		});
	}

}
