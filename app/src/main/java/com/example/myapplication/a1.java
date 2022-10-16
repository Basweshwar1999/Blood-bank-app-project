package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class a1 extends AppCompatActivity {
com.google.firebase.database.DatabaseReference ref;
ListView lv;
ArrayList<String> a;
ArrayAdapter<String> ad;
member m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        lv=(ListView) findViewById(R.id.lv);
a= new ArrayList<>();
ad= new ArrayAdapter<>(this, R.layout.d, R.id.t11, a);
m=new member();


        ref= FirebaseDatabase.getInstance().getReference("member");
    }

    public class DatabaseReference {

    }
}
