package Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.ConcreteSubjects;

import Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.Observer;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.Subject;

import java.util.ArrayList;
import java.util.List;

public class DoorSensor implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private boolean doorOpen;

    public void setDoorOpen(boolean open) {
        this.doorOpen = open;
        notifyObservers("Door is " + (open ? "OPEN" : "CLOSED"));
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

    public boolean isDoorOpen() {
        return doorOpen;
    }
}
