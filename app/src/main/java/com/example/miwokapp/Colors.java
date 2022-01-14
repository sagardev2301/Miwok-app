package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> word = new ArrayList<>();
        word.add(new Word("Red", "weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        word.add(new Word("Green", "chokokki",R.drawable.color_green,R.raw.color_green));
        word.add(new Word("Brown", "ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        word.add(new Word("Gray", "ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        word.add(new Word("Black", "kululli",R.drawable.color_black,R.raw.color_black));
        word.add(new Word("White", "kelelli",R.drawable.color_white,R.raw.color_white));
        word.add(new Word("Dusty Yellow", "ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        word.add(new Word("Mustard Yellow", "chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));


        WordAdapter adapter= new WordAdapter(this, word,R.color.pink_A200);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word words = word.get(position);

                mMediaPlayer = MediaPlayer.create(Colors.this,words.getAudioResourceId());

                mMediaPlayer.start();
            }
        });
    }

}