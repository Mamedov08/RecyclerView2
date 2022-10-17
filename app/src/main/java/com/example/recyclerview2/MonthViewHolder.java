package com.example.recyclerview2;



import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MonthViewHolder extends RecyclerView.ViewHolder {
    private TextView tvMonth;

    public MonthViewHolder(@NonNull View itemView) {
        super(itemView);

        tvMonth = itemView.findViewById(R.id.Tv_Month);

    }
    public void bind(String month) {
        tvMonth.setText(month);
    }
}

