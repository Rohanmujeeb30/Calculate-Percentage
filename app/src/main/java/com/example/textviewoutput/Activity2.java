package com.example.textviewoutput;

import static com.example.textviewoutput.MainActivity.average;
import static com.example.textviewoutput.MainActivity.result;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
TextView abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        abc = findViewById(R.id.textView2);
        abc.setText("Percentage is : "+(result)+"\n"+"Average is : "+(average));

    }





}