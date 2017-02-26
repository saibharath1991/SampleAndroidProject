package com.example.saibharath.a1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(this.getLocalClassName(),"Activity got created");
    }
 @Override
    protected void onStart(){
        super.onStart();
     Log.i(this.getLocalClassName(),"Activity got started");
    }

    @Override
    protected void onStop(){
        super.onStop();

        Log.d(this.getLocalClassName(),"Activity got stopped");
    }

    @Override
    protected void onPause(){
        super.onPause();

        Log.d(this.getLocalClassName(),"Activity got paused");
    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.d(this.getLocalClassName(),"Activity got resumed");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Log.i(this.getLocalClassName(),"Activity got destroyed");
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        Log.d(this.getLocalClassName(),"Activity got restarted");
    }


    public void addService(View view){
        startService(new Intent(getBaseContext(),MyService.class));
    }

    public void stopService(View view){
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}
