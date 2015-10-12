/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.demo.userpreferences;

import com.amazonaws.demo.userpreferences.R;
import com.amazonaws.tvmclient.AmazonClientManager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class UserPreferenceDemoActivity extends Activity {
	
	private static final String TAG = "UserPreferenceDemoActivity";
	public static AmazonClientManager clientManager = null;
	
	@Override
	public void onCreate( Bundle savedInstanceState ) {
		
		super.onCreate( savedInstanceState );
		setContentView( R.layout.main );
		
		// Create AmazonClientManager with SharedPreference
		clientManager = new AmazonClientManager( getSharedPreferences( "com.amazon.aws.demo.AWSDemo", Context.MODE_PRIVATE ) );
		
		TextView tvmUrlTextView = (TextView) findViewById( R.id.tvm_url_text_view );
		tvmUrlTextView.setText( PropertyLoader.getInstance().getTokenVendingMachineURL() );
		
		TextView sslEnabledTextView = (TextView) findViewById( R.id.ssl_enabled_text_view );
		sslEnabledTextView.setText( PropertyLoader.getInstance().useSSL() ? "YES" : "NO" );
		
		final Button createTableBttn = (Button) findViewById( R.id.create_table_bttn );
		createTableBttn.setOnClickListener( new View.OnClickListener() {
			
			public void onClick( View v ) {
				Log.i( TAG, "createTableBttn clicked." );
				
				String tableStatus = DynamoDBManager.getTestTableStatus();
				if ( tableStatus.length() == 0 ) {
					DynamoDBManager.createTable();
				}
				else {
					Toast.makeText( UserPreferenceDemoActivity.this, "The test table already exists.\nTable Status: " + tableStatus, Toast.LENGTH_LONG ).show();
				}
			}
		} );
		
		final Button insertUsersBttn = (Button) findViewById( R.id.insert_users_bttn );
		insertUsersBttn.setOnClickListener( new View.OnClickListener() {
			
			public void onClick( View v ) {
				Log.i( TAG, "insertUsersBttn clicked." );
				
				String tableStatus = DynamoDBManager.getTestTableStatus();
				if ( DynamoDBManager.getTestTableStatus().equalsIgnoreCase( "ACTIVE" ) ) {
					DynamoDBManager.insertUsers();
				}
				else {
					Toast.makeText( UserPreferenceDemoActivity.this, "The test table is not ready yet.\nTable Status: " + tableStatus, Toast.LENGTH_LONG ).show();
				}
			}
		} );
		
		final Button listUsersBttn = (Button) findViewById( R.id.list_users_bttn );
		listUsersBttn.setOnClickListener( new View.OnClickListener() {
			
			public void onClick( View v ) {
				Log.i( TAG, "listUsersBttn clicked." );
				
				String tableStatus = DynamoDBManager.getTestTableStatus();
				if ( DynamoDBManager.getTestTableStatus().equalsIgnoreCase( "ACTIVE" ) ) {
					startActivity( new Intent( UserPreferenceDemoActivity.this, UserListActivity.class ) );
				}
				else {
					Toast.makeText( UserPreferenceDemoActivity.this, "The test table is not ready yet.\nTable Status: " + tableStatus, Toast.LENGTH_LONG ).show();
				}
			}
		} );
		
		final Button deleteTableBttn = (Button) findViewById( R.id.delete_table_bttn );
		deleteTableBttn.setOnClickListener( new View.OnClickListener() {
			
			public void onClick( View v ) {
				Log.i( TAG, "deleteTableBttn clicked." );
				
				String tableStatus = DynamoDBManager.getTestTableStatus();
				if ( DynamoDBManager.getTestTableStatus().equalsIgnoreCase( "ACTIVE" ) ) {
					DynamoDBManager.cleanUp();
				}
				else {
					Toast.makeText( UserPreferenceDemoActivity.this, "The test table is not ready yet.\nTable Status: " + tableStatus, Toast.LENGTH_LONG ).show();
				}
			}
		} );
		
	}
}