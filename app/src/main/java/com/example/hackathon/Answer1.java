package com.example.hackathon;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import androidx.appcompat.app.AppCompatActivity;

public class Answer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        Button socialAnswer = (Button) findViewById(R.id.socialAnswer);
        socialAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SocialLife.class);
                startActivity(startIntent);
            }
        });

        Button schoolAnswer = (Button) findViewById(R.id.schoolAnswer);
        schoolAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), School.class);
                startActivity(startIntent);
            }
        });

        Button lifestyleAnswer = (Button) findViewById(R.id.lifestyleAnswer);
        lifestyleAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Lifestyle.class);
                startActivity(startIntent);
            }
        });

    }
}
