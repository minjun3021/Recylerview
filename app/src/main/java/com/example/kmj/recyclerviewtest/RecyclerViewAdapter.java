package com.example.kmj.recyclerviewtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    ArrayList<Item> item;

    public RecyclerViewAdapter(ArrayList<Item> item) {
        this.item = item;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item, parent, false);
        ViewHolder viewholder = new ViewHolder(v);
        Log.e("wow", "create");
        return viewholder;
    }

    @Override
    public int getItemCount() {
        Log.e("size", String.valueOf(item.size()));
        return item.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.age.setText(item.get(position).getAge());
        holder.name.setText(item.get(position).getName());
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, age;

        ViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
            age = view.findViewById(R.id.age);
        }
    }

}
