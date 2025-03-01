package Structural.AdapterDesignPattern.MusicPlayerExample.WithAdaptorPattern;

// New class that supports MP4 and VLC but has a different interface
public class AdvancedMediaPlayer {

    void playMP4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }

    void playVLC(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}
