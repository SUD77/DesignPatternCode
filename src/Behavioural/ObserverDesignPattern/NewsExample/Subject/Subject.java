package Behavioural.ObserverDesignPattern.NewsExample.Subject;


import Behavioural.ObserverDesignPattern.NewsExample.Observers.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String news);
    String getName(); // so observers can identify the channel
}
