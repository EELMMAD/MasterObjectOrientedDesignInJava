package se.udemy.elmira.observerPattern.subjects;

import se.udemy.elmira.observerPattern.observer.IObserver;

public interface ISubject {
    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
