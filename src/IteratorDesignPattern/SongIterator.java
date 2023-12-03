package IteratorDesignPattern;

import java.util.Iterator;
import java.util.List;

public class SongIterator implements Iterator {

    private List<String> songs;
    private int position=0;


    public SongIterator(List<String> songs){
        this.songs=songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Object next() {
        if(hasNext()){
            String song=songs.get(position);
            position++;
            return song;
        }
        return null;
    }
}
