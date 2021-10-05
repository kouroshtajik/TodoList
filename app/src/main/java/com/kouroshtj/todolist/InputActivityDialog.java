package com.kouroshtj.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivityDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_dialog);

        EditText edtTitle = findViewById(R.id.edtTitle);
        EditText edtDescription = findViewById(R.id.edtDescription);
        Button btnAdd = findViewById(R.id.btnAdd);

        DatabaseQueries database = new DatabaseQueries(InputActivityDialog.this,"todolist",null,1);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String todo = edtTitle.getText().toString();
                database.insertTask(todo);
                Intent intent = new Intent(InputActivityDialog.this, StarterActivity.class);
                startActivity(intent);

            }
        });
        
    }
}