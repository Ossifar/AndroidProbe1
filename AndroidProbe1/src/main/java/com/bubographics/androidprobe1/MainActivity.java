package com.bubographics.androidprobe1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements CompoundButton.OnCheckedChangeListener {

    //Variables
    ToggleButton Tg1;
    ToggleButton Tg2;
    TextView Tv;

    //Constructor
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tg1 = (ToggleButton) findViewById(R.id.toggleButton_CanviText);
        Tg1.setOnCheckedChangeListener(this);
        Tg2 = (ToggleButton) findViewById(R.id.toggleButton_MoureText);
        Tg2.setOnCheckedChangeListener(this);
        Tv = (TextView) findViewById(R.id.textView_Noticia);
    }

    //Methods
    public void GotoPantalla2(View view) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }

    public void onCheckedChanged(CompoundButton CompoundButton, boolean b) {
        if((Tg1.isChecked()))
        {
            Tv.setText(getResources().getString(R.string.quadre_text_1));
        }
        else
        {
            Tv.setText(getResources().getString(R.string.quadre_text_2));
        }

        if((Tg2.isChecked()))
        {
            Tv.setPadding(0,30,0,0);
        }
        else
        {
            Tv.setPadding(0,0,0,0);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
