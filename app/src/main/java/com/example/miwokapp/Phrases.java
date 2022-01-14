package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> word = new ArrayList<>();
        word.add(new Word("Where are you going?", "minto wuksus",R.mipmap.ic_launcher,R.raw.phrase_where_are_you_going));
        word.add(new Word("What is your name?", "tinnә oyaase'nә",R.mipmap.ic_launcher,R.raw.phrase_what_is_your_name));
        word.add(new Word("My name is...", "oyaaset...",R.mipmap.ic_launcher,R.raw.phrase_my_name_is));
        word.add(new Word("How are you feeling?", "michәksәs?",R.mipmap.ic_launcher,R.raw.phrase_how_are_you_feeling));
        word.add(new Word("I’m feeling good.", "kuchi achit",R.mipmap.ic_launcher,R.raw.phrase_im_feeling_good));
        word.add(new Word("Are you coming?", "әәnәs'aa?",R.mipmap.ic_launcher,R.raw.phrase_are_you_coming));
        word.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",R.mipmap.ic_launcher,R.raw.phrase_yes_im_coming));
        word.add(new Word("I’m coming.", "әәnәm",R.mipmap.ic_launcher,R.raw.phrase_im_coming));
        word.add(new Word("Let’s go.", "yoowutis",R.mipmap.ic_launcher,R.raw.phrase_lets_go));
        word.add(new Word("Come here.", "әnni'nem",R.mipmap.ic_launcher,R.raw.phrase_come_here));

        WordAdapter adapter= new WordAdapter(this, word,R.color.green_500);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word words = word.get(position);

                mMediaPlayer = MediaPlayer.create(Phrases.this,words.getAudioResourceId());

                mMediaPlayer.start();
            }
        });
    }
}