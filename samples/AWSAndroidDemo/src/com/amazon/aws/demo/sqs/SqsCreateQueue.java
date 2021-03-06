package com.amazon.aws.demo.sqs;

import com.amazon.aws.demo.AlertActivity;
import com.amazon.aws.demo.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SqsCreateQueue extends AlertActivity{
	
	protected Button submitButton;
	protected EditText queueName;
	protected TextView introText;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_item);
        submitButton = (Button) findViewById(R.id.create_it_submit_button);
        queueName = (EditText) findViewById(R.id.create_it_input_field);
        introText = (TextView) findViewById(R.id.create_it_intro_text);
        wireSubmitButton();
    }
	
	public void wireSubmitButton(){
		submitButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				queueName.setVisibility(View.INVISIBLE);
				try {
					SimpleQueue.createQueue(queueName.getText().toString());
					finish();
				} catch (Throwable e){
    				setStackAndPost(e);
				}
			}
		});
	}
}
