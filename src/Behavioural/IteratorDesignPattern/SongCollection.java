package Behavioural.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongCollection implements MediaCollection{

    /*
    * Here, data type can be on anytype, we dont have to use List. It can be array, hashmap, etc
    * And then out iterator will behave accordingly and we will have to impelement the iteration
    * logic accordingly.
    * */
    private List<String> songs=new ArrayList<>();

    public void addSong(String song){
        songs.add(song);
    }

    // This method will return our Custom Iterator for SongCollection.
    @Override
    public Iterator<String> createIterator() {
        return new SongIterator(songs);
    }
}
