package uk.co.endofhome.observer;

import java.util.ArrayList;

import static java.lang.String.*;

public class CurrencyExchange implements Observable {
    private final ArrayList<Observer> observers;
    private double eurToGbpExchangeRate;

    public CurrencyExchange() {
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
        observers.forEach(observer -> observer.update(eurToGbpExchangeRate));
    }

    public void setEurToGbpXrate(double newRate) {
        System.out.println(format("TODAY'S DATE: %s EUR TO 1 GBP", newRate));
        eurToGbpExchangeRate = newRate;
        notifyObservers();
    }
}