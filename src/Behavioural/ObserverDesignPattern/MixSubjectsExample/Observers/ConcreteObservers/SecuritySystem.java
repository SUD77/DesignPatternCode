package Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.ConcreteObservers;

import Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.Observer;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.ConcreteSubjects.DoorSensor;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.ConcreteSubjects.SecurityCamera;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.Subject;

public class SecuritySystem implements Observer {

    @Override
    public void update(String data, Subject source) {
        if (source instanceof SecurityCamera || source instanceof DoorSensor) {
            System.out.println("Security System Alert: " + data);
        }
    }
}
