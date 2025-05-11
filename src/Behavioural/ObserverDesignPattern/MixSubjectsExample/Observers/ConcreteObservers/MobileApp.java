package Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.ConcreteObservers;

import Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.Observer;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.Subject;

public class MobileApp implements Observer {

    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String data, Subject source) {
        System.out.println(name + " App received from " + source.getClass().getSimpleName() + ": " + data);
    }
}
