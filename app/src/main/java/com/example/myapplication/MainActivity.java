package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGood;
    Customer ct;
    ArrayList<Ao> arrayList;
    ListAdapter adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       lvGood = findViewById(R.id.lvGood);
       arrayList = new ArrayList<>();
       arrayList.add(new Ao("Google","80$",R.drawable.ic_launcher_background));
       arrayList.add(new Ao("Google","80$",R.drawable.ic_launcher_background));
       arrayList.add(new Ao("Google","80$",R.drawable.ic_launcher_background));
       adt = new Customer(this,R.layout.item,arrayList);
       lvGood.setAdapter((ListAdapter) adt);
    }


}