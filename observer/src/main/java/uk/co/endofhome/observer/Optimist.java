package uk.co.endofhome.observer;

public class Optimist implements Observer {

    @Override
    public void update(double xRate) {
        if (xRate > 1.2) {
            System.out.println("See! I told you it would all be fine. Boris knew what he was doing after all. We're laughin' all the way to the bank.");
        } else {
            System.out.println("Our exports will be up, Nigel said. They don't make warm beer like ours anywhere else in the  world!");
        }
    }
}
