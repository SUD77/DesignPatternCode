package Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.ConcreteSubjects;

import Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.Observer;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.Subject;

import java.util.ArrayList;
import java.util.List;

public class ThermoStat implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers("Temperature is now " + temperature + "°C");
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

    public int getTemperature() {
        return temperature;
    }
}
