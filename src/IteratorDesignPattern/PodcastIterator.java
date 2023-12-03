package IteratorDesignPattern;

import java.util.Iterator;
import java.util.List;

public class PodcastIterator implements Iterator {

    private List<String> podcasts;
    private int position=0;


    public PodcastIterator(List<String> podcasts){
        this.podcasts=podcasts;
    }

    @Override
    public boolean hasNext() {
        return position < podcasts.size();
    }

    @Override
    public Object next() {
        if(hasNext()){
            String podcast=podcasts.get(position);
            position++;
            return podcast;
        }
        return null;
    }
}
