package com.udemy.section12.challenge;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing: mp3 file. Name: "+filename);
        }else {
            System.out.println("Invalid media. "+audioType + " format not supported");
        }
    }
}
