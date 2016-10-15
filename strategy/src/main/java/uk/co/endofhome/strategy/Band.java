package uk.co.endofhome.strategy;

public abstract class Band {
    RockOutBehavior rockOutBehavior;
    ImproviseBehaviour improviseBehaviour;

    public void makeSomeNoise() {
        System.out.println("That's why we're here.");
    }

    public abstract void members();
}