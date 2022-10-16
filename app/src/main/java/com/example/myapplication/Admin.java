package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Admin extends AppCompatActivity {
EditText et1,et2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        et1=findViewById(R.id.t1);
        et2=findViewById(R.id.t2);
        b=findViewById(R.id.b1);
        b.setOnClickListener(v -> {
if(et1.getText().toString().equals("basweshwar") &&et2.getText().toString().equals("12345"))
{
Intent i=new Intent(getApplicationContext(),admin_section.class);
startActivity(i);
}
        });
    }
}
