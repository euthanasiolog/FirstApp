package com.dev.piatr.firstapp.feature;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by piatr on 01.12.17.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        TextView textView;
        textView = findViewById(R.id.message);
        if(extras!=null){
          String message = extras.getString("message");
          textView.setText(message);
        }
    }

    public void back (View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
