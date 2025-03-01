package Structural.AdapterDesignPattern.MusicPlayerExample.Before;

// Concrete class supporting only MP3 files
public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else {
            //Here we need to throw error but for time being showing this
            System.out.println("Error : Unsupported media format: " + audioType);
        }
    }
}
