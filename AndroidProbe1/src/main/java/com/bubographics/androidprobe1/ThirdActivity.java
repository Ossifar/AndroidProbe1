package com.bubographics.androidprobe1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.third, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.action_settings_2:
                i = new Intent(this, SecondActivity.class);
                startActivity(i);
                break;
            case R.id.action_settings_3:
                i = new Intent(this, ThirdActivity.class);
                startActivity(i);
                break;
        }
        return true;
    };
}
