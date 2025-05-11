package Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects;

import Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String data);
}
