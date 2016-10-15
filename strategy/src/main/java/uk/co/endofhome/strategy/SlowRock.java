package uk.co.endofhome.strategy;

public class SlowRock implements RockOutBehavior {

    @Override
    public void rockOut() {
        System.out.println("Some slow chugging sounds fill the room.");
    }
}
