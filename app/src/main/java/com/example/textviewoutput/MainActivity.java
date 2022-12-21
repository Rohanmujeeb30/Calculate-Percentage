package com.example.textviewoutput;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtedit1;
    Button add;

    static double result;
    static int average;
    boolean isvalid = false;

    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtedit1 = findViewById(R.id.eit1);

        add = findViewById(R.id.button1);
        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setTitle("HOLD ON");
        progressDialog.setMessage("Please wait");






        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String a = txtedit1.getText().toString();
                if(!a.equalsIgnoreCase("") ){
                    int c = Integer.parseInt(a);
                    if(c<=500){
                    result= (c /500.0) * 100;
                    average = c/5;
                    progressDialog.show();

                    Intent intent = new Intent(MainActivity.this,Activity2.class);
                    startActivity(intent);
                    finish();
                    }
                    else{
                    Toast.makeText(getApplicationContext(),"Application is supported for 5 courses",Toast.LENGTH_SHORT).show();}
                }


                else{
                    progressDialog.dismiss();

                    Toast.makeText(getApplicationContext(),"Please enter your marks",Toast.LENGTH_SHORT).show();
                }


            }


        });

    }

}