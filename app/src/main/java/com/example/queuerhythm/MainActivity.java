package com.example.queuerhythm;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //private MediaPlayer mediaPlayer;

    private ArrayList<Music> arrayList;
    private MusicAdapter adapter;
    private ListView musicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musicList = (ListView) findViewById(R.id.musicList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Pennyroyal", "MF Doom", R.raw.pennyroyal));

        adapter = new MusicAdapter(this,R.layout.music_item, arrayList);
        musicList.setAdapter(adapter);


    }
}
