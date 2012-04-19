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

package com.amazon.aws.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodb.model.AttributeValue;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class UserListActivity extends ListActivity {
	
	private static final String TAG = "UserListActivity";
	private List<Map<String, AttributeValue>> items = null;
	private ArrayList<String> labels = null;
	private int currentPosition = 0;
	private ArrayAdapter<String> arrayAdapter = null;
	
	@Override
	public void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		
		try {
			this.labels = new ArrayList<String>();
			
			this.items = DynamoDBManager.getUserList();
			
			for ( Map<String, AttributeValue> hp : this.items ) {
				this.labels.add( hp.get( "firstName" ).getS() + " " + hp.get( "lastName" ).getS() );
			}
			
			arrayAdapter = new ArrayAdapter<String>( this, R.layout.user_list_item, this.labels );
			setListAdapter( arrayAdapter );
			
			ListView lv = getListView();
			lv.setOnItemLongClickListener( new OnItemLongClickListener() {
				
				@Override
				public boolean onItemLongClick( AdapterView<?> av, View v, int pos, long id ) {
					return onLongListItemClick( v, pos, id );
				}
			} );
			
			Toast toast = Toast.makeText( this, "Tap and hold to delete users", Toast.LENGTH_LONG );
			toast.show();
			
		}
		catch ( Exception e ) {
			Log.e( TAG, Log.getStackTraceString( e ) );
		}
	}
	
	@Override
	protected void onListItemClick( ListView l, View v, int position, long id ) {
		
		Intent intent = new Intent( UserListActivity.this, UserActivity.class );
		intent.putExtra( "USER_NO", items.get( position ).get( "userNo" ).getN() );
		startActivity( intent );
	}
	
	protected boolean onLongListItemClick( View v, int position, long id ) {
		
		DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick( DialogInterface dialog, int which ) {
				switch ( which ) {
					case DialogInterface.BUTTON_POSITIVE:

						UserListActivity.this.runOnUiThread( new Runnable() {
							
							public void run() {
								DynamoDBManager.deleteUser( items.get( currentPosition ).get( "userNo" ) );
								items.remove( currentPosition );
								labels.remove( currentPosition );
								arrayAdapter.notifyDataSetChanged();
							}
						} );
						
						break;
					
					case DialogInterface.BUTTON_NEGATIVE:
						// Do nothing
						break;
				}
			}
		};
		
		AlertDialog.Builder builder = new AlertDialog.Builder( this );
		builder.setMessage( "Do you want to delete this user?" ).setPositiveButton( "Yes", dialogClickListener ).setNegativeButton( "No", dialogClickListener ).show();
		
		currentPosition = position;
		
		return true;
	}
}
