package com.brianschaaf.feedyoursoul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        String[] apps = {"Fried Pickles", "Mozz Sticks", "Spring Rolls", "Wings", "Riblets", }
    }
}