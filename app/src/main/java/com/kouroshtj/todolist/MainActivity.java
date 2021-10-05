package com.kouroshtj.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fetching data

        DatabaseQueries database = new DatabaseQueries(MainActivity.this,"todolist",null,1);
        List<String> todolist = database.getTask();


        RecyclerView recycler = findViewById(R.id.recycler);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false);
        recycler.setLayoutManager(manager);
        TodoAdapter adapter = new TodoAdapter(todolist);
        recycler.setAdapter(adapter);

        FloatingActionButton button = findViewById(R.id.addButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InputActivityDialog.class);
                startActivity(intent);

            }
        });
    }
}