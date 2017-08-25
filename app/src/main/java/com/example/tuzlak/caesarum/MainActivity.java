package com.example.tuzlak.caesarum;

import java.text.DateFormat;
//import android.icu.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private boolean isInEditMode = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button saveButton = (Button)findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editTitle  = (EditText)findViewById(R.id.editTitle);
                EditText editNote   = (EditText)findViewById(R.id.editNote);

                if (isInEditMode) {
                    isInEditMode = false;
                    saveButton.setText("Edit");
                    editNote.setEnabled(false);
                    editTitle.setEnabled(false);

                    TextView dateView = (TextView)findViewById(R.id.dateView);
                    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    String date = dateFormat.format(Calendar.getInstance().getTime());
                    dateView.setText(date);
                } else {
                    isInEditMode = true;
                    saveButton.setText("Save");
                    editNote.setEnabled(true);
                    editTitle.setEnabled(true);
                }
            }
        });
    }
}
