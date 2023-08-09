package com.udemy.section12.challenge;

public class VlcPlayer implements AdvanceMediaPlayer{

    String filename;

    @Override
    public void loadFilename(String filename) {
        this.filename=filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing: Vlc file. Name: " + filename);
    }
}
