package uk.co.endofhome.observer;

public class Anarchist extends Commentator implements Observer {
    private final CurrencyExchange currencyExchange;
    private double eurToGbpExchangeRate;

    public Anarchist(CurrencyExchange currencyExchange, String name) {
        super(name);
        this.currencyExchange = currencyExchange;
        currencyExchange.registerObserver(this);
    }

    @Override
    public void update(double updatedXrate) {
        eurToGbpExchangeRate = updatedXrate;
        this.introduction();
        opinion();
    }

    @Override
    public void opinion() {
        if (eurToGbpExchangeRate > 1.2) {
            System.out.println("Buy Bitcoin!");
        } else {
            System.out.println("Crash JP Morgan. Buy silver!");
        }
    }
}