package com.example.passvariableusingactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);

        TextView textView1 = (TextView)findViewById(R.id.textview1);
        TextView textView2 = (TextView)findViewById(R.id.textview2);

        textView1.setText(text);
        textView2.setText(""+number);

    }
}