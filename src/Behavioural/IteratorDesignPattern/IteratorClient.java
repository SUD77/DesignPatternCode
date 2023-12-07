package Behavioural.IteratorDesignPattern;

import java.util.Iterator;

public class IteratorClient {

    public static void main(String[] args) {

        /*
        * So, Client defines both the collection and its Iteration method and then
        * uses the both.
        * For example : We as cleint define the collection we want to use i.e arraylist, hashmap
        * and then we store the data and also, for iteration, we define the iterator too.
        * */


        SongCollection songCollection = new SongCollection();
        songCollection.addSong("Song 1");
        songCollection.addSong("Song 2");
        songCollection.addSong("Song 3");

        PodcastCollection podcastCollection = new PodcastCollection();
        podcastCollection.addPodcast("Podcast 1");
        podcastCollection.addPodcast("Podcast 2");
        podcastCollection.addPodcast("Podcast 3");

        // Using SongIterator
        Iterator<String> songIterator = songCollection.createIterator();
        while (songIterator.hasNext()) {
            String song = songIterator.next();
            System.out.println("Playing song: " + song);
        }

        // Using PodcastIterator
        Iterator<String> podcastIterator = podcastCollection.createIterator();
        while (podcastIterator.hasNext()) {
            String podcast = podcastIterator.next();
            System.out.println("Playing podcast: " + podcast);
        }
    }

}
