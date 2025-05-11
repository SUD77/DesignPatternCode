package Behavioural.ObserverDesignPattern.NewsExample.Observers.ConcreteObserver;

import Behavioural.ObserverDesignPattern.NewsExample.Observers.Observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news, String channelName) {
        System.out.println(name + " received update from " + channelName + ": " + news);
    }
}
