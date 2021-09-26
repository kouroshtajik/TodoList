package com.kouroshtj.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = findViewById(R.id.recycler);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false);
        recycler.setLayoutManager(manager);
        TodoAdapter adapter = new TodoAdapter();
        recycler.setAdapter(adapter);
    }
}