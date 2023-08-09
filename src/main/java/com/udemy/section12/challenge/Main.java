package com.udemy.section12.challenge;

public class Main {

    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("mp3", "piosenka1.mp3");

        mediaPlayer=new AdvanceMediaPlayerAdapter(new Mp4Player());
        mediaPlayer.play("Mp4", "piosenka2.mp4");

        mediaPlayer=new AdvanceMediaPlayerAdapter(new VlcPlayer());
        mediaPlayer.play("Vlc", "piosenka3.vlc");
    }

}
