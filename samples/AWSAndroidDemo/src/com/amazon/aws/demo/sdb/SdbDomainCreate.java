package com.amazon.aws.demo.sdb;

import com.amazon.aws.demo.AlertActivity;
import com.amazon.aws.demo.R;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SdbDomainCreate extends AlertActivity {
	
	protected Button submitButton;
	protected EditText domainName;
	protected TextView introText;
	protected Handler mHandler;
		
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_item);
        submitButton = (Button) findViewById(R.id.create_it_submit_button);
        mHandler = new Handler();
        domainName = (EditText) findViewById(R.id.create_it_input_field);
        introText = (TextView) findViewById(R.id.create_it_intro_text);
        introText.setText("Enter Domain Name:");
        wireSubmitButton();
    }
	
	public void wireSubmitButton(){
		submitButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				domainName.setVisibility(View.INVISIBLE);
				try{
					SimpleDB.createDomain(domainName.getText().toString());
					finish();
				} catch (Throwable e){
    				setStackAndPost(e);
				}
			}
		});
	}
}
