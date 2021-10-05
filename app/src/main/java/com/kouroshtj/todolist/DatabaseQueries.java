package com.kouroshtj.todolist;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseQueries extends SQLiteOpenHelper {
    String TABLE_NAME = "todoList";

    public DatabaseQueries(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME + "(" +
                "_id integer primary key autoincrement," +
                "task text" + ")";
        db.execSQL(CREATE_TABLE_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
    }

    public void insertTask(String task){
        String INSERT_TASK_QUERY = "INSERT INTO " + TABLE_NAME +
                "(task) VALUES(" + "'" +task+ "'" + ")";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(INSERT_TASK_QUERY);
        db.close();
    }

    public List<String> getTask(){
        String SELECT_TASKS_QUERY = "SELECT task FROM" + TABLE_NAME;
        ArrayList<String> tasks = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(SELECT_TASKS_QUERY,null);
        while (cursor.moveToNext()){
            String task = cursor.getString(0);
            tasks.add(task);
        }
        db.close();
        return tasks;
    }
}
