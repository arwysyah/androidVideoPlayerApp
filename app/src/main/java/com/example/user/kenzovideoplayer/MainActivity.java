package com.example.user.kenzovideoplayer;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.MediaController;

import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    VideoView VideoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView = (VideoView) findViewById(R.id.videoViewId);
        MediaController media_Controller= new MediaController(this);

        VideoView.setVideoPath("android.resource://" + getPackageName()+ "/"+ R.raw.kenzo32);
        VideoView.setVideoPath("android.resource://" + getPackageName()+ "/"+ R.raw.video1);
        media_Controller.setAnchorView(VideoView);
        VideoView.setMediaController(media_Controller);

    }

    public void playvideo(View view) {VideoView.start();

    }

    public void pausevideo(View view) {VideoView.pause();

    }

    public void stopvideo(View view) {VideoView.stopPlayback();
        finish();
        moveTaskToBack(true);
    }
}
