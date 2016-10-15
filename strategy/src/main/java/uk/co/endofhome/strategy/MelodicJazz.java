package uk.co.endofhome.strategy;

public class MelodicJazz implements ImproviseBehaviour {
    @Override
    public void improvise() {
        System.out.println("Some catchy freeform styles swirl around you.");
    }
}
