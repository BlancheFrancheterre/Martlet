package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SocialLife extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_life);

        Button link1 = (Button) findViewById(R.id.link1);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link1 = "https://www.facebook.com/events/";
                Uri facebook = Uri.parse(link1);

                Intent goToFacebook = new Intent(Intent.ACTION_VIEW, facebook);
                if (goToFacebook.resolveActivity(getPackageManager()) != null){
                    startActivity(goToFacebook);
                }
            }
        });

        Button link2 = (Button) findViewById(R.id.link2);
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link2 = "https://www.eventbrite.ca/d/canada--montreal/events/";
                Uri eventbrite = Uri.parse(link2);

                Intent goToEvent = new Intent(Intent.ACTION_VIEW, eventbrite);
                if (goToEvent.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToEvent);
                }
            }
        });

        Button link3 = (Button) findViewById(R.id.link3);
        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link3 = "https://nightlife.ca/quoi-faire/";
                Uri nightlife = Uri.parse(link3);

                Intent goToNight = new Intent(Intent.ACTION_VIEW, nightlife);
                if (goToNight.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToNight);
                }
            }
        });

    }
}
