package uk.co.endofhome.observer;

public class Pessimist implements Observer {
    @Override
    public void update(double xRate) {
        if (xRate > 1.2) {
            System.out.println("It can only go down. And it will. We're doomed. I saw it in an Adam Curtis movie.");
        } else if (xRate < 0.5) {
            System.out.println("DOOOOOOOOOOMED. I'm heading into my bunker and cracking out the sardines. Good job I saved all those old copper-two pence pieces.");
        } else {
            System.out.println("Groan.");
        }
    }
}