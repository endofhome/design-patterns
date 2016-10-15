package uk.co.endofhome.strategy;

public abstract class Band {
    String name;
    RockOutBehavior rockOutBehavior;
    ImproviseBehaviour improviseBehaviour;

    public void setRockOutBehavior(RockOutBehavior rob) {
        rockOutBehavior = rob;
    }

    public void setImproviseBehaviour(ImproviseBehaviour ib) {
        improviseBehaviour = ib;
    }

    public void rockOut() {
        rockOutBehavior.rockOut();
    }

    public void improvise() {
        improviseBehaviour.improvise();
    }

    public void makeSomeNoise() {
        System.out.println("That's why we're here.");
    }

    public abstract void members();
}