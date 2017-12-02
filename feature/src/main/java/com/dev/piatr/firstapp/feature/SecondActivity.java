package com.dev.piatr.firstapp.feature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by piatr on 01.12.17.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        TextView textView = new TextView(this);
        if(extras!=null){
          String message = extras.getString("message");
          textView.setText(message);
        }
        setContentView(textView);
    }
}
