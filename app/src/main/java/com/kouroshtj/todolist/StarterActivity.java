package com.kouroshtj.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StarterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);
        Button btnStart = findViewById(R.id.btnStart);
        Button btnRecycler = findViewById(R.id.btnRecycler);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StarterActivity.this, InputActivityDialog.class);
                startActivity(intent);
            }
        });
        btnRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StarterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}