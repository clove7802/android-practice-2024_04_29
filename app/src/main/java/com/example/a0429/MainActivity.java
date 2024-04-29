package com.example.a0429;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
TextView counter;
int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = findViewById(R.id.countertext);
        counter.setText(String.valueOf(count));
    }
    public void plus(View v){
        count++;
        counter.setText(String.valueOf(count));
    }
    public void minus(View v){
        count--;
        if (count < 0){
            count = 0;
        }
        counter.setText(String.valueOf(count));
    }
    public void reset(View v){
        count = 0;
        counter.setText(String.valueOf(count));
    }

}