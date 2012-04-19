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

import java.util.Map;

import com.amazonaws.services.dynamodb.model.AttributeValue;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;

public class UserActivity extends Activity {
	
	private int userNo = 0;
	
	@Override
	public void onCreate( Bundle savedInstanceState ) {
		
		super.onCreate( savedInstanceState );
		setContentView( R.layout.user_preference );
		
		userNo = Integer.valueOf( getIntent().getExtras().getString( "USER_NO" ) );
		Map<String, AttributeValue> userInfo = DynamoDBManager.getUserInfo( userNo );
		
		String userName = userInfo.get( "firstName" ).getS() + " " + userInfo.get( "lastName" ).getS();
		
		final TextView textViewUserName = (TextView) findViewById( R.id.textViewUserName );
		textViewUserName.setText( userName );
		
		final CheckBox checkBoxAutoLogin = (CheckBox) findViewById( R.id.checkBoxAutoLogin );
		checkBoxAutoLogin.setChecked( userInfo.get( "autoLogin" ) != null && userInfo.get( "autoLogin" ).getS().equalsIgnoreCase( "YES" ) );
		checkBoxAutoLogin.setOnCheckedChangeListener( new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged( CompoundButton buttonView, boolean isChecked ) {
				AttributeValue targetValue = new AttributeValue().withN( String.valueOf( userNo ) );
				DynamoDBManager.updateAttributeStringValue( isChecked ? "YES" : "NO", "autoLogin", targetValue );
			}
		} );
		
		final CheckBox checkBoxVibrate = (CheckBox) findViewById( R.id.checkBoxVibrate );
		checkBoxVibrate.setChecked( userInfo.get( "vibrate" ) != null && userInfo.get( "vibrate" ).getS().equalsIgnoreCase( "YES" ) );
		checkBoxVibrate.setOnCheckedChangeListener( new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged( CompoundButton buttonView, boolean isChecked ) {
				AttributeValue targetValue = new AttributeValue().withN( String.valueOf( userNo ) );
				DynamoDBManager.updateAttributeStringValue( isChecked ? "YES" : "NO", "vibrate", targetValue );
			}
		} );
		
		final CheckBox checkBoxSilent = (CheckBox) findViewById( R.id.checkBoxSilent );
		checkBoxSilent.setChecked( userInfo.get( "silent" ) != null && userInfo.get( "silent" ).getS().equalsIgnoreCase( "YES" ) );
		checkBoxSilent.setOnCheckedChangeListener( new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged( CompoundButton buttonView, boolean isChecked ) {
				AttributeValue targetValue = new AttributeValue().withN( String.valueOf( userNo ) );
				DynamoDBManager.updateAttributeStringValue( isChecked ? "YES" : "NO", "silent", targetValue );
			}
		} );
		
		final Spinner spinnerColorTheme = (Spinner) findViewById( R.id.spinnerColorTheme );
		if ( userInfo.get( "colorTheme" ) != null ) {
			Resources res = getResources();
			String[] colors = res.getStringArray( R.array.color_theme );
			for ( int i = 0; i < colors.length; i++ ) {
				if ( colors[ i ].equalsIgnoreCase( userInfo.get( "colorTheme" ).getS() ) ) {
					spinnerColorTheme.setSelection( i, true );
				}
			}
		}
		spinnerColorTheme.setOnItemSelectedListener( new OnItemSelectedListener() {
			
			@Override
			public void onItemSelected( AdapterView<?> arg0, View arg1, int pos, long arg3 ) {
				
				Resources res = getResources();
				String[] colors = res.getStringArray( R.array.color_theme );
				
				AttributeValue targetValue = new AttributeValue().withN( String.valueOf( userNo ) );
				DynamoDBManager.updateAttributeStringValue( colors[ pos ], "colorTheme", targetValue );
			}
			
			@Override
			public void onNothingSelected( AdapterView<?> arg0 ) {

				// Do nothing
			}
		} );
	}
}
