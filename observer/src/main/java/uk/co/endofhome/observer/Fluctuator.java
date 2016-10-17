package uk.co.endofhome.observer;

public class Fluctuator {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();

        Optimist optimist = new Optimist(currencyExchange, "The Optimist");
        Pessimist pessimist = new Pessimist(currencyExchange, "The Pessimist");
        Anarchist anarchist = new Anarchist(currencyExchange, "The Anarchist");

        currencyExchange.setEurToGbpXrate(1.5);
        System.out.println("");

        currencyExchange.setEurToGbpXrate(1.1);
        System.out.println("");

        currencyExchange.setEurToGbpXrate(0.4);
        System.out.println("");
    }
}
