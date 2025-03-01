package Structural.AdapterDesignPattern.MusicPlayerExample.WithAdaptorPattern;

import Structural.AdapterDesignPattern.MusicPlayerExample.Before.MediaPlayer;
/*
*  Here, client calls the audio player with the song (& format) he wants to play
* Audio player, is able to play the old format, but for new formats, it needs to call some other method
* i.e done here through an Adaptor.
* */
public class MusicPlayerClient {

    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayerNew();

        player.play("mp3", "song.mp3");  // ✅ Works
        player.play("mp4", "video.mp4"); // ✅ Works via Adapter
        player.play("vlc", "movie.vlc"); // ✅ Works via Adapter
        player.play("avi", "random.avi"); // ❌ Unsupported
    }
}
