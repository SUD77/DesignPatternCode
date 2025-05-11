package Behavioural.ObserverDesignPattern.NewsExample;

import Behavioural.ObserverDesignPattern.NewsExample.Observers.ConcreteObserver.Subscriber;
import Behavioural.ObserverDesignPattern.NewsExample.Subject.ConcreteSubject.NewsChannel;

public class NewsAppClient {

    public static void main(String[] args) {

        // Subjects
        NewsChannel cnn = new NewsChannel("CNN");
        NewsChannel espn = new NewsChannel("ESPN");
        NewsChannel techCrunch = new NewsChannel("TechCrunch");

        // Observers
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        // Subscriptions
        cnn.registerObserver(alice);
        espn.registerObserver(alice);

        techCrunch.registerObserver(bob);

        cnn.registerObserver(charlie);
        espn.registerObserver(charlie);
        techCrunch.registerObserver(charlie);

        // Publish News
        cnn.publishNews("Elections are coming!");
        espn.publishNews("Champions League Final Tonight!");
        techCrunch.publishNews("New Java Version Released!");

    }
}
