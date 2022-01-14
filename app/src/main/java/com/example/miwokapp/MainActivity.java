package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.title_1);
        TextView family = (TextView) findViewById(R.id.title_2);
        TextView colors = (TextView) findViewById(R.id.title_3);
        TextView phrases = (TextView) findViewById(R.id.title_4);
        numbers.setOnClickListener(view -> {
            Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
            startActivity(numbersIntent);
        });
        family.setOnClickListener(view -> {
            Intent familyIntent = new Intent(MainActivity.this, Family.class);
            startActivity(familyIntent);
        });
        colors.setOnClickListener(view -> {
            Intent colorsIntent = new Intent(MainActivity.this, Colors.class);
            startActivity(colorsIntent);
        });
        phrases.setOnClickListener(view -> {
            Intent phrasesIntent = new Intent(MainActivity.this, Phrases.class);
            startActivity(phrasesIntent);
        });

    }

}