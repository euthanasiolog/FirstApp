package com.dev.piatr.firstapp.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage (View view){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText message = (EditText) findViewById(R.id.message);
        String sendMessage = message.getText().toString();
        intent.putExtra("message", sendMessage);
        startActivity(intent);
    }

}
