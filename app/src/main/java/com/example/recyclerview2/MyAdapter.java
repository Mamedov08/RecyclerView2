package com.example.recyclerview2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter <MonthViewHolder>{

    private ArrayList<String>  monthList;

    public MyAdapter(ArrayList<String> mountainsList) {
        this.monthList = mountainsList;
    }

    @NonNull
    @Override
    public MonthViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return new MonthViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.costume_design, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MonthViewHolder holder, int position) {
        holder.bind(monthList.get(position));
    }

    @Override
    public int getItemCount() {
        return monthList.size();
    }
}
