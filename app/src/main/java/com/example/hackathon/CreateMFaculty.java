package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CreateMFaculty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_mfaculty);

        EditText fileText = (EditText) findViewById(R.id.fileBlank);
        String faculty = fileText.toString();

        Intent startIntent = new Intent(getApplicationContext(),EntranceActivity.class);
        startActivity(startIntent);

    }


}
