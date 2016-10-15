package uk.co.endofhome.strategy;

public class ArtEnsembleOfChicago extends Band {

    public ArtEnsembleOfChicago() {
        rockOutBehavior = new CannotRockOut();
        improviseBehaviour = new FreeJazz();
    }

    @Override
    public void members() {
        System.out.println("Lester Bowie, Malachi Favors Maghostut, Joseph Jarman and Roscoe Mitchell.");
    }
}
