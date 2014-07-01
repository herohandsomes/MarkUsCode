package com.example.vidu1;

import java.util.List;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.ParseQuery;
import com.parse.PushService;
import com.parse.ParseException;
import com.parse.GetCallback;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Parse.initialize(this, "DjJPYiGE8mPMUznQD59DI79mjvpWZIrxbYKqyfv9", "bmefSDMCUVmZWZg8EJM2IUiVTMO2Vqla0UZvmNcs");
        /*PushService.setDefaultPushCallback(this, MainActivity.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();
        ParseObject testObject= new ParseObject("SUPERMARKET_BRAND_NAME");
        testObject.put("SUPER_MARKET_BRAND_NAME_ID",8);
        testObject.put("SUPER_MARKET_BRAND_NAME","DANG");
        testObject.saveInBackground();*/
        
        ParseQuery<ParseObject> query = ParseQuery.getQuery("SUPERMARKET_BRAND_NAME");
        query.getInBackground("RToFajqe53", new GetCallback<ParseObject>() {
          public void done(ParseObject object, ParseException e) {
            if (e == null) {
              // object will be your game score
            	int t = object.getInt("SUPER_MARKET_BRAND_NAME_ID");
            	String s = object.getString("SUPER_MARKET_BRAND_NAME");
            	Toast.makeText(getApplicationContext(), t + " " + s, Toast.LENGTH_LONG).show();
            } else {
              // word
            }
          }
        });
    }
}
