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

package com.amazonaws.demo.userpreferencesom;

import com.amazonaws.demo.userpreferencesom.DynamoDBManager.UserPreference;

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
		final UserPreference userInfo = DynamoDBManager.getUserPreference( userNo );
		
		String userName = userInfo.getFirstName() + " " + userInfo.getLastName();
		
		final TextView textViewUserName = (TextView) findViewById( R.id.textViewUserName );
		textViewUserName.setText( userName );
		
		final CheckBox checkBoxAutoLogin = (CheckBox) findViewById( R.id.checkBoxAutoLogin );
		checkBoxAutoLogin.setChecked( userInfo.isAutoLogin() == null ? true : userInfo.isAutoLogin());
		checkBoxAutoLogin.setOnCheckedChangeListener( new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged( CompoundButton buttonView, boolean isChecked ) {
				userInfo.setAutoLogin(isChecked);
				DynamoDBManager.updateUserPreference(userInfo);
			}
		} );
		
		final CheckBox checkBoxVibrate = (CheckBox) findViewById( R.id.checkBoxVibrate );
		checkBoxVibrate.setChecked( userInfo.isVibrate() == null ? false : userInfo.isVibrate());
		checkBoxVibrate.setOnCheckedChangeListener( new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged( CompoundButton buttonView, boolean isChecked ) {
				userInfo.setVibrate(isChecked);
				DynamoDBManager.updateUserPreference(userInfo);
			}
		} );
		
		final CheckBox checkBoxSilent = (CheckBox) findViewById( R.id.checkBoxSilent );
		checkBoxSilent.setChecked(userInfo.isSilent() == null ? false : userInfo.isSilent());
		checkBoxSilent.setOnCheckedChangeListener( new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged( CompoundButton buttonView, boolean isChecked ) {
				userInfo.setSilent(isChecked);
				DynamoDBManager.updateUserPreference(userInfo);
			}
		} );
		
		final Spinner spinnerColorTheme = (Spinner) findViewById( R.id.spinnerColorTheme );
		if ( userInfo.getColorTheme() != null) {
			Resources res = getResources();
			String[] colors = res.getStringArray( R.array.color_theme );
			for ( int i = 0; i < colors.length; i++ ) {
				if ( colors[ i ].equalsIgnoreCase( userInfo.getColorTheme()) ) {
					spinnerColorTheme.setSelection( i, true );
				}
			}
		}
		spinnerColorTheme.setOnItemSelectedListener( new OnItemSelectedListener() {
			
			@Override
			public void onItemSelected( AdapterView<?> arg0, View arg1, int pos, long arg3 ) {
				
				Resources res = getResources();
				String[] colors = res.getStringArray( R.array.color_theme );
				
				userInfo.setColorTheme(colors[ pos ]);
				DynamoDBManager.updateUserPreference(userInfo);
			}
			
			@Override
			public void onNothingSelected( AdapterView<?> arg0 ) {

				// Do nothing
			}
		} );
	}
}
