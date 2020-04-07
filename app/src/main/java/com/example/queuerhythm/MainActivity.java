package com.example.queuerhythm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private MediaPlayer mediaPlayer;
    List<Music> musicList;
    //private ArrayList<Music> arrayList;
    //private MusicAdapter musicAdapter;
    //private ListView musicList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_main);
        RecyclerView rvMusic = findViewById(R.id.rvMusic);

        musicList = new ArrayList<>();
        musicList.add(new Music("Pennyroyal", "MF Doom", R.raw.pennyroyal));
        musicList.add(new Music("Pennyroyal", "MF Doom", R.raw.pennyroyal));
        musicList.add(new Music("Pennyroyal", "MF Doom", R.raw.pennyroyal));
        musicList.add(new Music("Pennyroyal", "MF Doom", R.raw.pennyroyal));
        // create the adapter
        MusicAdapter musicAdapter = new MusicAdapter(this, (ArrayList<Music>) musicList);
        // Set adapter on the RV
        rvMusic.setAdapter(musicAdapter);
        //Set layout manager on RV
        rvMusic.setLayoutManager(new LinearLayoutManager(this));




        // musicList = (ListView) findViewById(R.id.musicList);
        // arrayList = new ArrayList<>();
       // arrayList.add(new Music("Pennyroyal", "MF Doom", R.raw.pennyroyal));
        // adapter = new MusicAdapter(this,R.layout.music_item, arrayList);
       // musicList.setAdapter(adapter);


    }


}
