package uk.co.endofhome.observer;

public class Optimist extends Commentator implements Observer {
    private final String name = "Optimist";
    private final CurrencyExchange currencyExchange;
    private double eurToGbpExchangeRate;

    public Optimist(CurrencyExchange currencyExchange, String name) {
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
            System.out.println("See! I told you it would all be fine. Boris knew what he was doing after all. We're laughin' all the way to the bank.");
        } else {
            System.out.println("Our exports will be up, Nigel said. They don't make warm beer like ours anywhere else in the  world!");
        }
    }
}