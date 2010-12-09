package com.amazon.aws.demo.sdb;

import android.os.Bundle;

import com.amazon.aws.demo.CustomListActivity;

public class SdbItemList extends CustomListActivity {
	
	protected String[] itemNameList;
    protected String domainName;
	
	private static final String SUCCESS = "Item List";
	
	private final Runnable postResults = new Runnable() {
		@Override
		public void run(){
			updateUi(itemNameList, SUCCESS);
		}
	};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = this.getIntent().getExtras();
        domainName = extras.getString(SimpleDB.DOMAIN_NAME);
        startPopulateList();
    }
    
    protected void obtainListItems(){
		itemNameList = SimpleDB.getItemNamesForDomain(domainName);
        getHandler().post(postResults);
    }
    
}
