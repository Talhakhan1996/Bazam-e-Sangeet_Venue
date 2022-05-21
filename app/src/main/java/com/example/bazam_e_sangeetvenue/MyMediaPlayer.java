package com.example.bazam_e_sangeetvenue;

import android.media.MediaPlayer;

public class MyMediaPlayer {
    static MediaPlayer instance;

    public static MediaPlayer getInstance(){
        if(instance == null){
            instance = new MediaPlayer();
        }
        return instance;
    }

    public static int currentIndex = -1;

}
