package com.example.taskx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<grocery_list> grocery_list = new ArrayList<>();
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 1", "Line 2"));
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 3", "Line 4"));
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 5", "Line 6"));
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 1", "Line 2"));
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 3", "Line 4"));
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 5", "Line 6"));
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 1", "Line 2"));
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 3", "Line 4"));
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 5", "Line 6"));
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 1", "Line 2"));
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 3", "Line 4"));
        grocery_list.add(new grocery_list(R.drawable.ic_launcher_foreground, "Line 5", "Line 6"));
        mRecyclerView = findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new main2adapter(grocery_list);


        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.setAdapter(mAdapter);
    }
}
