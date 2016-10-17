package uk.co.endofhome.observer;

public class Pessimist extends Commentator implements Observer {
    private final CurrencyExchange currencyExchange;
    private double eurToGbpExchangeRate;

    public Pessimist(CurrencyExchange currencyExchange, String name) {
        super(name);
        this.currencyExchange = currencyExchange;
        currencyExchange.registerObserver(this);
    }

    @Override
    public void update(double updatedXRate) {
        eurToGbpExchangeRate = updatedXRate;
        this.introduction();
        opinion();
    }

    @Override
    public void opinion() {
        if (eurToGbpExchangeRate > 1.2) {
            System.out.println("It can only go down. And it will. We're doomed. I saw it in an Adam Curtis movie.");
        } else if (eurToGbpExchangeRate < 0.5) {
            System.out.println("DOOOOOOOOOOMED. I'm heading into my bunker and cracking out the sardines. Good job I saved all those old copper two-pence pieces.");
        } else {
            System.out.println("Groan.");
        }
    }
}