package com.example.tuzlak.caesarum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListNotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_notes);

        ListView notesList = (ListView) findViewById(R.id.notesList);

        List<String> values = new ArrayList<String>();
        values.add("First note");
        values.add("Second note");
        values.add("Third note");
        values.add("Fourth note");
        values.add("Fifth note");

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        notesList.setAdapter(adapter);
    }
}
