package Behavioural.IteratorDesignPattern;

import java.util.Iterator;

public interface MediaCollection {

    /* Here, Type of Iterator can be any generic type. For our example we are taking it as String
    i.e we are assuming any collection that implements this interface, will have data of type String.

     */
    Iterator<String> createIterator();
}
