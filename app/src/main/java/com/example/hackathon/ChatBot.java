package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ChatBot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot2);
        Button enterButton = (Button) findViewById(R.id.enterButton);
        enterButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText numberScale = (EditText) findViewById(R.id.numberScale);
                int num = Integer.parseInt(numberScale.getText().toString());
                if (num < 3) {
                    Intent startIntent = new Intent(getApplicationContext(), Answer1.class);
                    startActivity(startIntent);
                } else if ((num < 6)){
                    Intent startIntent = new Intent(getApplicationContext(), Answer2.class);
                    startActivity(startIntent);
                } else if(num >= 6){
                    Intent startIntent = new Intent(getApplicationContext(), Answer3.class);
                    startActivity(startIntent);
                }

            }
        });

    }
}
