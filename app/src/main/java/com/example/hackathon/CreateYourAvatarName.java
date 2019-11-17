package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import java.io.Serializable;
public class CreateYourAvatarName extends AppCompatActivity {

    EditText nameText;
    EditText idText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_your_avatar_name);



       Button buttonToFaculty = (Button) findViewById(R.id.buttonToFaculty);
       buttonToFaculty.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


               nameText = (EditText) findViewById(R.id.nameBlank);
               idText = (EditText) findViewById(R.id.idBlank);

               Intent startIntent = new Intent(getApplicationContext(),EntranceActivity.class);
               String name = nameText.getText().toString();
               int id = Integer.parseInt(idText.getText().toString());

               startIntent.putExtra("NAME",name);

               // create intent to go to 2nd Activity
               startActivity(startIntent);
           }
       });


    }
}
