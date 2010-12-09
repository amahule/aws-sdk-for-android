package com.amazon.aws.demo.s3;

import com.amazon.aws.demo.AlertActivity;
import com.amazon.aws.demo.R;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class S3CreateBucket extends AlertActivity {
	
	protected Button submitButton;
	protected EditText bucketName;
	protected TextView introText;
	protected Handler mHandler;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHandler = new Handler();
        setContentView(R.layout.create_item);
        submitButton = (Button) findViewById(R.id.create_it_submit_button);
        bucketName = (EditText) findViewById(R.id.create_it_input_field);
        introText = (TextView) findViewById(R.id.create_it_intro_text);
        introText.setText("Enter Bucket Name:");
        wireSubmitButton();
    }
	
	public void wireSubmitButton(){
		submitButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				bucketName.setVisibility(View.INVISIBLE);
				try{
					S3.createBucket(bucketName.getText().toString());
					finish();
				} catch(Throwable e){
    				setStackAndPost(e);
				}
			}
		});
	}
	
	

}
