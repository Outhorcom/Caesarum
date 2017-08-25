package com.example.tuzlak.caesarum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListNotesActivity extends AppCompatActivity {

    private List<Note> notes = new ArrayList<Note>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_notes);

        notes.add(new Note("First note", "Blah Blah", new Date()));
        notes.add(new Note("Second note", "Blah Blah", new Date()));
        notes.add(new Note("Third note", "Blah Blah", new Date()));
        notes.add(new Note("Fourth note", "Blah Blah", new Date()));
        notes.add(new Note("Fifth note", "Blah Blah", new Date()));

        populateList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_listnotes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        notes.add(new Note("Added note", "blahhahahha", new Date()));

        populateList();

        return true;
    }

    private void populateList() {
        ListView notesList = (ListView) findViewById(R.id.notesList);
        List<String> values = new ArrayList<String>();

        for(Note note : notes) {
            values.add(note.getTitle());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        notesList.setAdapter(adapter);
    }
}
