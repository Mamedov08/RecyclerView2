package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> menuList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        menuList.add("January");
        menuList.add("February");
        menuList.add("March");
        menuList.add("April");
        menuList.add("May");
        menuList.add("June");
        menuList.add("July");
        menuList.add("August");
        menuList.add("September");
        menuList.add("October");
        menuList.add("November");
        menuList.add("December");


        MyAdapter adapter = new MyAdapter(menuList);

        recyclerView.setAdapter(adapter);

    }
}