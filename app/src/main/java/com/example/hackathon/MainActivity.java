package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button connect = (Button) findViewById(R.id.connect);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText enteredId = (EditText) findViewById(R.id.idBlank);
                String enteredIdStr = enteredId.toString()+".csv";
                File file = new File(enteredIdStr);

                boolean accountExists = file.isFile();
                if(accountExists) {

                    // create intent to connect and go to Entrance activity
                    Intent startIntent = new Intent(getApplicationContext(), EntranceActivity.class);
                    startActivity(startIntent);
                } else {

                    // if account isn't found
                    Intent startIntent = new Intent(getApplicationContext(), CreateYourAvatarName.class);
                    startActivity(startIntent);
                }


            }
        });

        Button createAvatar = (Button) findViewById(R.id.createAvatar);
        createAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create intent to go to 2nd Activity

                Intent startIntent = new Intent(getApplicationContext(), CreateYourAvatarName.class);
               // startIntent.putExtra("m", (Serializable) m);
                startActivity(startIntent);
            }
        });


    }

}
