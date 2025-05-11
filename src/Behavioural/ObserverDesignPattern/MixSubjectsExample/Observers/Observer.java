package Behavioural.ObserverDesignPattern.MixSubjectsExample.Observers;

import Behavioural.ObserverDesignPattern.MixSubjectsExample.Subjects.Subject;

public interface Observer {
    void update(String data, Subject source);
}
