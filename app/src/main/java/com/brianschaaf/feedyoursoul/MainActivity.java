package com.brianschaaf.feedyoursoul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainCourseCard;
    TextView emailText;
    CardView dessertCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainCourseCard = findViewById(R.id.card_view_main);
        emailText = findViewById(R.id.text_view_email);


        emailText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchGmail = new Intent(Intent.ACTION_SENDTO);
                launchGmail.setData(Uri.parse("mailto:feedYourSoul@reallygood.com"));

                startActivity(launchGmail);
            }
        });

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

                startActivity(startersActivityIntent);
            }
        });
        mainCourseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainCourseActivityIntent = new Intent(MainActivity.this, MainCourseActivity.class);

                startActivity(mainCourseActivityIntent);
            }
        });

        dessertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertActivityIntent = new Intent(MainActivity.this, DessertActivity.class);

                startActivity(dessertActivityIntent);
            }
        });
    }
}