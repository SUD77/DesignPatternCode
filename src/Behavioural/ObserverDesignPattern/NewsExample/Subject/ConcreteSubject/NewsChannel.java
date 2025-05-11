package Behavioural.ObserverDesignPattern.NewsExample.Subject.ConcreteSubject;

import Behavioural.ObserverDesignPattern.NewsExample.Observers.Observer;
import Behavioural.ObserverDesignPattern.NewsExample.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Subject {

    private String name;
    private List<Behavioural.ObserverDesignPattern.NewsExample.Observers.Observer> subscribers = new ArrayList<>();

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        for (Observer observer : subscribers) {
            observer.update(news, this.name);
        }
    }

    public void publishNews(String news) {
        System.out.println("[" + name + "] Breaking News: " + news);
        notifyObservers(news);
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }
}
