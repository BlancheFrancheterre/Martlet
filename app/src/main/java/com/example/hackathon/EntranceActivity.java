package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EntranceActivity extends AppCompatActivity {

    String Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance);

        Intent i = getIntent();
       // Martlet martlet = (Martlet) i.getSerializableExtra("m");
       // Martlet m= (Martlet) getIntent.getSerializableExtra("martlet");

        Name = getIntent().getExtras().getString("NAME");
        TextView namePrint = (TextView) findViewById(R.id.chatbotTitle);
        namePrint.setText("Hello "+ Name+ " ! ");


        // Access the chatbot by clicking on marty
        Button chatbotButton = (Button) findViewById(R.id.chatbotBtn);
        chatbotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ChatBot.class);
                startActivity(startIntent);
            }
        });


        // Access the information base
        ImageButton informationBtn = (ImageButton)findViewById(R.id.informationBtn);
        informationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Information.class);
                startActivity(startIntent);
            }
        });

        // Access social/activity
        ImageButton socialBtn = (ImageButton) findViewById(R.id.social);
        socialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent1 = new Intent(getApplicationContext(), Information.class);
                startActivity(startIntent1);
            }
        });
        // Access call
        ImageButton callBtn = (ImageButton) findViewById(R.id.phone);
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent2 = new Intent(getApplicationContext(), Information.class);
                startActivity(startIntent2);
            }
        });

        final ProgressBar progressBarEnergy= (ProgressBar) findViewById(R.id.progressBar8);


        // Access eat
        ImageButton eatBtn = (ImageButton) findViewById(R.id.eat);
        eatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // progressBarEnergy.setProgress(80);
                Intent startIntent3 = new Intent(getApplicationContext(), Information.class);
                startActivity(startIntent3);
            }
        });



    }


}
