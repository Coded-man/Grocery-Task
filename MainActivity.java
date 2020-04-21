package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<GroceryItem> mGroceryList;

    private RecyclerView mRecyclerView;
    private GroceryAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createGroceryList();
        buildRecyclerView();

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Activity();
            }
        });
    }

    public void openMain2Activity() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }


    public void createGroceryList() {
        mGroceryList = new ArrayList<>();
        mGroceryList.add(new GroceryItem(R.drawable.butter, "Butter", "#200"));
        mGroceryList.add(new GroceryItem(R.drawable.egg, "Egg", "#50"));
        mGroceryList.add(new GroceryItem(R.drawable.yogurt, "Yogurt", "#1200"));
        mGroceryList.add(new GroceryItem(R.drawable.cheese, "Cheese", "#2000"));
        mGroceryList.add(new GroceryItem(R.drawable.date, "Date", "#500"));
        mGroceryList.add(new GroceryItem(R.drawable.avocado, "Avocado", "#600"));
        mGroceryList.add(new GroceryItem(R.drawable.bread, "Bread", "#300"));
        mGroceryList.add(new GroceryItem(R.drawable.meat, "Meat", "#2500"));

    }

    public void changeItem(int position, String text) {
        mGroceryList.get(position).changeText1(text);
        mAdapter.notifyItemChanged(position);
    }

    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new GroceryAdapter(mGroceryList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new GroceryAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
              changeItem(position, "Add to cart");
            }
        });
    }
}
