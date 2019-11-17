package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CreateYourAvatarName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_your_avatar_name);



       Button buttonToFaculty = (Button) findViewById(R.id.buttonToFaculty);
       buttonToFaculty.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


               EditText nameText = (EditText) findViewById(R.id.nameBlank);
               EditText idText = (EditText) findViewById(R.id.idBlank);

               String name = nameText.toString();
               int id = Integer.parseInt(idText.getText().toString());

               // create intent to go to 2nd Activity
               Intent startIntent = new Intent(getApplicationContext(),EntranceActivity.class);
               startActivity(startIntent);

           }
       });

    }
}
