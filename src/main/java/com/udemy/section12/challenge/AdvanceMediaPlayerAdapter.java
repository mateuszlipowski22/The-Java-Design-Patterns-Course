package com.udemy.section12.challenge;

public class AdvanceMediaPlayerAdapter implements MediaPlayer{

    private AdvanceMediaPlayer advanceMediaPlayer;

    public AdvanceMediaPlayerAdapter(AdvanceMediaPlayer advanceMediaPlayer) {
        this.advanceMediaPlayer = advanceMediaPlayer;
    }


    @Override
    public void play(String audioType, String filename) {
            advanceMediaPlayer.loadFilename(filename);
            advanceMediaPlayer.listen();
    }
}
