package uk.co.endofhome.observer;

import java.util.ArrayList;

public class EurToGbpExchangeRate implements Observable {
    private final ArrayList<Observer> observers;
    private double xRate;

    public EurToGbpExchangeRate() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(xRate));
    }
}