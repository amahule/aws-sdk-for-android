package com.amazon.aws.demo.s3;

import java.util.List;

import com.amazon.aws.demo.CustomListActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class S3BucketList extends CustomListActivity{
	
	protected List<String> bucketNameList;
	
	private static final String SUCCESS = "Bucket List";

	
	private final Runnable postResults = new Runnable() {
		@Override
		public void run(){
			updateUi(bucketNameList, SUCCESS);
		}
	};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startPopulateList();
    }
    
    protected void obtainListItems(){
		bucketNameList = S3.getBucketNames();
        getHandler().post(postResults);
    }
    
   	@Override	
	protected void wireOnListClick(){
		getItemList().setOnItemClickListener(new OnItemClickListener() {
		    @Override
		    public void onItemClick(AdapterView<?> list, View view, int position, long id) {
		    	final String bucketName = ((TextView)view).getText().toString();
				Intent bucketViewIntent = new Intent(S3BucketList.this, S3BucketView.class);
				bucketViewIntent.putExtra( S3.BUCKET_NAME, bucketName );
				startActivity(bucketViewIntent);
		    }
		 });
	}
    		
}
