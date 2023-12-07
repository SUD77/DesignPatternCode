package Behavioural.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PodcastCollection implements MediaCollection{

    /*
     * Here, data type can be on anytype, we dont have to use List. It can be array, hashmap, etc
     * And then out iterator will behave accordingly and we will have to impelement the iteration
     * logic accordingly.
     * */
    private List<String> podcasts=new ArrayList<>();


    public void addPodcast(String podcast){
        podcasts.add(podcast);
    }

    // This method will return our Custom Iterator for Podcast Collection
    @Override
    public Iterator<String> createIterator() {
        return new PodcastIterator(podcasts);
    }
}
