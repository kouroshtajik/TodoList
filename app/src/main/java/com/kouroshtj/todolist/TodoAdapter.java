package com.kouroshtj.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TodoAdapter extends RecyclerView.Adapter<TodoViewHolder> {
    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_item,parent,false);
        TodoViewHolder holder = new TodoViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {
        switch (position) {
            case 0:
                holder.txtTodo.setText("num1");
                break;
            case 1:
                holder.txtTodo.setText("num2");
                break;
            case 2:
                holder.txtTodo.setText("num3");
                break;
            case 3:
                holder.txtTodo.setText("num4");
                break;

        }

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
