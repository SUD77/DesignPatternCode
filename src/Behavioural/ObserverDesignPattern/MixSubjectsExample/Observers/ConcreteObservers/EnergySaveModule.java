package Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.ConcreteObservers;

import Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.Observer;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.ConcreteSubjects.ThermoStat;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.Subject;

public class EnergySaveModule implements Observer {

    @Override
    public void update(String data, Subject source) {
        if (source instanceof ThermoStat) {
            System.out.println("Energy Saver adjusting based on: " + data);
        }
    }
}
