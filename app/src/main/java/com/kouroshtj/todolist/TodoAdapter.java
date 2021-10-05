package com.kouroshtj.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoViewHolder> {
    List<String> todo;
    public TodoAdapter(List<String> todolist){
        todo = todolist;
    }
    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_item,parent,false);
        TodoViewHolder holder = new TodoViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {
        holder.txtTodo.setText(todo.get(position));
    }

    @Override
    public int getItemCount() {
        return todo.size();
    }
}
