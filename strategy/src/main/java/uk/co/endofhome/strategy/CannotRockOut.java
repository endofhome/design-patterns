package uk.co.endofhome.strategy;

public class CannotRockOut implements RockOutBehavior {

    @Override
    public void rockOut() {
        System.out.println("Oh no man, we don't do that stuff.");
    }
}
