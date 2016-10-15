package uk.co.endofhome.strategy;

public class NapalmDeath extends Band {

    public NapalmDeath() {
        name = "Napalm Death";
        rockOutBehavior = new FastGrind();
        improviseBehaviour = new CannotImprovise();
    }

    @Override
    public void members() {
        System.out.println("Nicholas Bullen, Simon Oppenheimer and Miles Ratledge make up the original line-up,");
    }
}
