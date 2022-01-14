package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList <Word> word = new ArrayList<>();
        word.add(new Word("One", "lutti",R.drawable.number_one,R.raw.number_one));
        word.add(new Word("Two", "otiiko", R.drawable.number_two,R.raw.number_two));
        word.add(new Word("Three", "tolookosu",R.drawable.number_three,R.raw.number_three));
        word.add(new Word("Four", "oyyisa", R.drawable.number_four,R.raw.number_four));
        word.add(new Word("Five", "massokka",R.drawable.number_five,R.raw.number_five));
        word.add(new Word("Six", "temmokka",R.drawable.number_six,R.raw.number_six));
        word.add(new Word("Seven", "kenekaku",R.drawable.number_seven,R.raw.number_seven));
        word.add(new Word("Eight", "kawinta", R.drawable.number_eight,R.raw.number_eight));
        word.add(new Word("Nine", "wo'e",R.drawable.number_nine,R.raw.number_nine));
        word.add(new Word("Ten", "na'aacha",R.drawable.number_ten,R.raw.number_ten));


        WordAdapter adapter= new WordAdapter(this, word,R.color.orange_500);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word words=  word.get(position);
                mMediaPlayer = MediaPlayer.create(Numbers.this,words.getAudioResourceId());

                mMediaPlayer.start();
            }
        });
    }
}