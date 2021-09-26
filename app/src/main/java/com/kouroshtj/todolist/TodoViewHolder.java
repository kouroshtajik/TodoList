package com.kouroshtj.todolist;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TodoViewHolder extends RecyclerView.ViewHolder {
    TextView txtTodo;
    public TodoViewHolder(@NonNull View itemView) {
        super(itemView);
        txtTodo = itemView.findViewById(R.id.txtTodo);
    }
}
