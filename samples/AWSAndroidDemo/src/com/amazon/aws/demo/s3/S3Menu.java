package com.amazon.aws.demo.s3;

import com.amazon.aws.demo.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class S3Menu extends Activity {
	
	Button listButton;
	Button createButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s3_menu);
        wireButtons();
    }
    
    public void wireButtons(){
    	listButton = (Button) findViewById(R.id.s3_main_list_button);
    	createButton = (Button) findViewById(R.id.s3_main_create_button);
    	
    	listButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(S3Menu.this, S3BucketList.class));
			}
		});
    	
    	createButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(S3Menu.this, S3CreateBucket.class));
			}
		});
    }

}
