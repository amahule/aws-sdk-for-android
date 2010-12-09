package com.amazon.aws.demo;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Properties;

import com.amazon.aws.demo.R;
import com.amazon.aws.demo.s3.S3Menu;
import com.amazon.aws.demo.sdb.SdbMenu;
import com.amazon.aws.demo.sns.SnsMenu;
import com.amazon.aws.demo.sqs.SqsMenu;
import com.amazonaws.auth.BasicAWSCredentials;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AWSDemo extends Activity {
    
	private Handler mHandler;
	private static final String success = "Welcome to The AWS Browser Demo!";
	private static final String fail = "Load Failed. Please Try Restarting the Application.";
	
	public static BasicAWSCredentials credentials = null;
	protected Button snsButton;
	protected Button sqsButton;
	protected Button s3Button;
	protected Button sdbButton;
	protected TextView welcomeText;
	
	private boolean credentials_found;
	
	private final Runnable postResults = new Runnable() {
		@Override
		public void run(){
			updateUi();
		}
	};
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mHandler = new Handler();
        snsButton = (Button) findViewById(R.id.main_notify_button);
        sqsButton = (Button) findViewById(R.id.main_queue_button);
        s3Button = (Button) findViewById(R.id.main_storage_button);
        sdbButton = (Button) findViewById(R.id.main_sdb_button);
        welcomeText = (TextView) findViewById(R.id.main_into_text);
        startGetCredentials();

    }
    
    protected void updateUi(){
    	if(credentials_found == true){
    		welcomeText.setText(success);
    		snsButton.setVisibility(View.VISIBLE);
    		sqsButton.setVisibility(View.VISIBLE);
    		s3Button.setVisibility(View.VISIBLE);
    		sdbButton.setVisibility(View.VISIBLE);
    		wireButtons();
    	} else {
    		displayCredentialsIssueAndExit();
    		welcomeText.setText(fail);
    	}
    }
    
    private void wireButtons(){
        snsButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(AWSDemo.this, SnsMenu.class));
			}
		});
		
		sqsButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity( new Intent(AWSDemo.this, SqsMenu.class));
			}
		});
		
		s3Button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(AWSDemo.this, S3Menu.class));
			}
		});
		
		sdbButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(AWSDemo.this, SdbMenu.class));
			}
		});
    }
    
    private void startGetCredentials() {
    	Thread t = new Thread() {
    		@Override
    		public void run(){
    	        try {            
    	            Properties properties = new Properties();
    	            properties.load( getClass().getResourceAsStream( "AwsCredentials.properties" ) );
    	            
    	            String accessKeyId = properties.getProperty( "accessKey" );
    	            String secretKey = properties.getProperty( "secretKey" );
    	            
    	            if ( ( accessKeyId == null ) || ( accessKeyId.equals( "" ) ) ||
    	            	 ( accessKeyId.equals( "CHANGEME" ) ) ||( secretKey == null )   || 
    	                 ( secretKey.equals( "" ) ) || ( secretKey.equals( "CHANGEME" ) ) ) {
    	                Log.e( "AWS", "Aws Credentials not configured correctly." );                                    
        	            credentials_found = false;
    	            } else {
    	            credentials = new BasicAWSCredentials( properties.getProperty( "accessKey" ), properties.getProperty( "secretKey" ) );
        	        credentials_found = true;
    	            }

    	        }
    	        catch ( Exception exception ) {
    	            Log.e( "Loading AWS Credentials", exception.getMessage() );
    	            credentials_found = false;
    	        }
    			AWSDemo.this.mHandler.post(postResults);
    		}
    	};
    	t.start();
    }
    
    protected void displayCredentialsIssueAndExit() {
        AlertDialog.Builder confirm = new AlertDialog.Builder( this );
        confirm.setTitle("Credential Problem!");
        confirm.setMessage( "AWS Credentials not configured correctly.  Please review the README file." );
        confirm.setNegativeButton( "OK", new DialogInterface.OnClickListener() {
                public void onClick( DialogInterface dialog, int which ) {
        AWSDemo.this.finish();
                }
        } );
        confirm.show().show();                
    }
    


}