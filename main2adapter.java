package com.example.taskx;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.selection.SelectionTracker;
import androidx.recyclerview.selection.StableIdKeyProvider;
import androidx.recyclerview.selection.StorageStrategy;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class main2adapter extends RecyclerView.Adapter<main2adapter.MyViewHolder> {
    private ArrayList<grocery_list> mgrocery_list;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;


        public MyViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView3);
            mTextView2 = itemView.findViewById(R.id.textView4);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public main2adapter(ArrayList<grocery_list> grocery_list) { mgrocery_list = grocery_list;}

    // Create new views (invoked by the layout manager)
    @Override
    public main2adapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grocery_list, parent, false);
        MyViewHolder evh = new MyViewHolder(v);
        return evh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        grocery_list currentItem = (mgrocery_list.get(position));

        holder.mImageView.setImageResource(currentItem.getmImageResource());
        holder.mTextView1.setText(currentItem.getmText1());
        holder.mTextView2.setText(currentItem.getmText2());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mgrocery_list.size();
    }
}

   /* SelectionTracker tracker = new SelectionTracker.Builder<>(
            "my-selection-id",
            recyclerView,
            new StableIdKeyProvider(recyclerView),
            new MyDetailsLookup(recyclerView),
            StorageStrategy.createLongStorage())
            .withOnItemActivatedListener(myItemActivatedListener)
            .build();
} */
