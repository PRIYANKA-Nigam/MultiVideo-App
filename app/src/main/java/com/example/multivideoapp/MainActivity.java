package com.example.multivideoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
              YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
              getLifecycle().addObserver(youTubePlayerView);
                YouTubePlayerView youTubePlayerView1 = findViewById(R.id.youtube_player_view2);
                getLifecycle().addObserver(youTubePlayerView1);
                YouTubePlayerView youTubePlayerView2= findViewById(R.id.youtube_player_view3);
                getLifecycle().addObserver(youTubePlayerView2);


    }
}