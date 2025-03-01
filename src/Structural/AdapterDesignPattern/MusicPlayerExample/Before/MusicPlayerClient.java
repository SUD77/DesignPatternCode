package Structural.AdapterDesignPattern.MusicPlayerExample.Before;

public class MusicPlayerClient {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();

        player.play("mp3", "song.mp3");  // ✅ Works
        player.play("mp4", "video.mp4"); // ❌ Unsupported
        player.play("vlc", "movie.vlc"); // ❌ Unsupported
    }
}
