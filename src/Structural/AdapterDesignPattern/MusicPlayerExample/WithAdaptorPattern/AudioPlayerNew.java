package Structural.AdapterDesignPattern.MusicPlayerExample.WithAdaptorPattern;

import Structural.AdapterDesignPattern.MusicPlayerExample.Before.MediaPlayer;

public class AudioPlayerNew implements MediaPlayer {

    private Adaptor adapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            adapter = new Adaptor(audioType);
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Error : Unsupported media format: " + audioType);
        }
    }
}
