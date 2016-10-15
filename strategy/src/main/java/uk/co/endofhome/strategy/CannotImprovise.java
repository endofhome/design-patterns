package uk.co.endofhome.strategy;

public class CannotImprovise implements ImproviseBehaviour {

    @Override
    public void improvise() {
        System.out.println("You what? Doesn't sound like music to me.");
    }
}
