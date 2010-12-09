package com.amazon.aws.demo.sdb;

import com.amazon.aws.demo.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SdbMenu extends Activity {

	Button createDomainButton;
	Button createItemButton;
	Button listDomainButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sdb_menu);
        wireButtons();
    }
    
    public void wireButtons(){
    	createItemButton = (Button) findViewById(R.id.sdb_main_create_item_button);
    	createDomainButton = (Button) findViewById(R.id.sdb_main_create_domain_button);
    	listDomainButton = (Button) findViewById(R.id.sdb_main_view_domains_button);
    	
    	createItemButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(SdbMenu.this, SdbItemCreate.class));
			}
		});
    	
    	createDomainButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(SdbMenu.this, SdbDomainCreate.class));
			}
		});
    	
    	listDomainButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(SdbMenu.this, SdbDomainList.class));
			}
		});
    }
}
