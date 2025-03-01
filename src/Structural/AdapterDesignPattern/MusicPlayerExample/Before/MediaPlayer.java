package Structural.AdapterDesignPattern.MusicPlayerExample.Before;

// Target interface that supports only MP3 files
public interface MediaPlayer {
    void play(String audioType,String fileName);
}
