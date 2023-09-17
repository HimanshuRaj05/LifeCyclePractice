package com.intreve.lifecyclepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Exp4","onCreate invoked");
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Exp4", "onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Exp4", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Exp4","onPause invoked");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Exp4","onStop invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Exp4", "onDestroy invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Exp4","onRestart invoked");
    }
}