package uk.co.endofhome.strategy;

public class MilesDavis extends Band {

    public MilesDavis() {
        name = "Miles Davis";
        rockOutBehavior = new CannotRockOut();
        improviseBehaviour = new MelodicJazz();
    }

    @Override
    public void members() {
        System.out.println("Mr Davis, sometimes with John Coltrane, Herbie Hancock and others.");
    }
}
