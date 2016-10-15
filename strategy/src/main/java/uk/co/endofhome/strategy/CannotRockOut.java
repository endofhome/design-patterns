package uk.co.endofhome.strategy;

public class CannotRockOut implements RockOutBehavior {

    @Override
    public void RockOut() {
        System.out.println("Oh no man, we don't do that stuff.");
    }
}
