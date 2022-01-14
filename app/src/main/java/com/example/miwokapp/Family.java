package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.MediaController;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList <Word> word = new ArrayList<>();
        word.add(new Word("Father", "әpә",R.drawable.family_father,R.raw.family_father));
        word.add(new Word("Mother", "әṭa",R.drawable.family_mother,R.raw.family_mother));
        word.add(new Word("Son", "angsi",R.drawable.family_son,R.raw.family_son));
        word.add(new Word("Daughter", "tune",R.drawable.family_daughter,R.raw.family_daughter));
        word.add(new Word("Older Brother", "taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        word.add(new Word("Younger Brother", "chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        word.add(new Word("Older Sister", "teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        word.add(new Word("Younger Sister", "kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        word.add(new Word("Grandmother", "ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        word.add(new Word("Grandfather", "paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter adapter= new WordAdapter(this, word,R.color.blue_A);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word words = word.get(position);

                mMediaPlayer = MediaPlayer.create(Family.this,words.getAudioResourceId());

                mMediaPlayer.start();
            }
        });
    }
}