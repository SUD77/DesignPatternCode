package Behavioural.ObserverDesignPattern.MixSubjectsExample;

import Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.ConcreteObservers.EnergySaveModule;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.ConcreteObservers.MobileApp;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers.ConcreteObservers.SecuritySystem;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.ConcreteSubjects.DoorSensor;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.ConcreteSubjects.SecurityCamera;
import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.ConcreteSubjects.ThermoStat;

public class SmartHomeAppClient {
    public static void main(String[] args) {


        // Devices
        ThermoStat thermostat = new ThermoStat();
        DoorSensor doorSensor = new DoorSensor();
        SecurityCamera camera = new SecurityCamera();

        // Apps
        MobileApp mobileApp = new MobileApp("SmartHome");
        SecuritySystem security = new SecuritySystem();
        EnergySaveModule energy = new EnergySaveModule();

        // Subscriptions
        thermostat.registerObserver(mobileApp);
        thermostat.registerObserver(energy);

        doorSensor.registerObserver(mobileApp);
        doorSensor.registerObserver(security);

        camera.registerObserver(mobileApp);
        camera.registerObserver(security);

        // Events
        thermostat.setTemperature(23);
        doorSensor.setDoorOpen(true);
        camera.detectMotion();
    }
}
