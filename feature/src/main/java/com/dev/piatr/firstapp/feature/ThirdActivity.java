package com.dev.piatr.firstapp.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Bundle extras = getIntent().getExtras();
        TextView onCreate;
        TextView onStart ;
        TextView onResume;
        TextView onPause ;
        TextView onStop ;
        TextView onDestroy;
        onCreate = findViewById(R.id.countOnCreate);
        onStart = findViewById(R.id.countOnStart);
        onResume = findViewById(R.id.countOnResume);
        onPause = findViewById(R.id.countOnPause);
        onStop = findViewById(R.id.countOnStop);
        onDestroy = findViewById(R.id.countOnDestroy);
        TextView onCreateView;
        TextView onStartView ;
        TextView onResumeView;
        TextView onPauseView ;
        TextView onStopView ;
        TextView onDestroyView;
        onCreateView = findViewById(R.id.activityOnCreate);
        onStartView = findViewById(R.id.activityOnStart);
        onResumeView = findViewById(R.id.activityOnResume);
        onPauseView = findViewById(R.id.activityOnPause);
        onStopView = findViewById(R.id.activityOnStop);
        onDestroyView = findViewById(R.id.activityOnDestroy);

        if(extras!=null){
           int countOnCreate = extras.getInt("onCreateCount");
           onCreate.setText(String.valueOf(countOnCreate));
           int countOnStart = extras.getInt("onStartCount");
           onStart.setText(String.valueOf(countOnStart));
           int countOnResume = extras.getInt("onResumeCount");
           onResume.setText(String.valueOf(countOnResume));
           int countOnPause = extras.getInt("onPauseCount");
           onPause.setText(String.valueOf(countOnPause));
           int countOnStop = extras.getInt("onStopCount");
           onStop.setText(String.valueOf(countOnStop));
           int countOnDestroy = extras.getInt("onDestroyCount");
           onDestroy.setText(String.valueOf(countOnDestroy));
        }
    }

    public void back (View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

}
