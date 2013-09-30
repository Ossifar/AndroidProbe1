package com.bubographics.androidprobe1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void GotoPantalla1 (View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.action_settings_1:
                i = new Intent(this, MainActivity.class);
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
