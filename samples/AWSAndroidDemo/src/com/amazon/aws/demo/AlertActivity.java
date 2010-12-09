package com.amazon.aws.demo;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class AlertActivity extends Activity {
	
	private String errorTrace;
	private Handler mHandler;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		mHandler = new Handler();
	}
	protected Runnable displayError = new Runnable(){
		public void run(){
			Log.e("", errorTrace);
		    AlertDialog.Builder confirm = new AlertDialog.Builder( AlertActivity.this );
		    confirm.setTitle( "A Connection Error Occured!");
		    confirm.setMessage( "Please Review the README\n" + errorTrace );
		    confirm.setNegativeButton( "OK", new DialogInterface.OnClickListener() {
		            public void onClick( DialogInterface dialog, int which ) {
		    AlertActivity.this.finish();
		            }
		    } );
		    confirm.show().show();   
		}
    };
	
    protected void setStackTrace(Throwable aThrowable) {
        final Writer result = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(result);
        aThrowable.printStackTrace(printWriter);
        errorTrace = result.toString();
    }
    
    public void setStackAndPost(Throwable aThrowable){
    	setStackTrace(aThrowable);
    	mHandler.post(displayError);
    }
   
	

}
