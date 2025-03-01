package Structural.AdapterDesignPattern.MusicPlayerExample.WithAdaptorPattern;

import Structural.AdapterDesignPattern.MusicPlayerExample.Before.MediaPlayer;

public class Adaptor implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public Adaptor(String audioType) {
        advancedMediaPlayer = new AdvancedMediaPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMP4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVLC(fileName);
        } else {
            System.out.println("Error : Invalid media type: " + audioType);
        }
    }
}
