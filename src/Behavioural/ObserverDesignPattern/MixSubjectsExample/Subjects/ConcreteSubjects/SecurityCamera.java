package Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.ConcreteSubjects;

import Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.Observer;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.Subject;

import java.util.ArrayList;
import java.util.List;

public class SecurityCamera implements Subject {

    private List<Observer> observers = new ArrayList<>();

    public void detectMotion() {
        notifyObservers("Motion detected!");
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String data) {
        for (Observer o : observers) {
            o.update(data, this);
        }
        System.out.println();
    }
}
