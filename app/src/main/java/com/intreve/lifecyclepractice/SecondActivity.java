package com.intreve.lifecyclepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("Exp4","onCreate 2 invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Exp4", "onStart 2 invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Exp4", "onResume 2 invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Exp4","onPause 2 invoked");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Exp4","onStop 2 invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Exp4", "onDestroy 2 invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Exp4","onRestart 2 invoked");
    }
}