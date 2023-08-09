package com.udemy.section12.challenge;

public class Mp4Player implements AdvanceMediaPlayer {

    String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename=filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing: mp4 file. Name: " + filename);
    }
}
