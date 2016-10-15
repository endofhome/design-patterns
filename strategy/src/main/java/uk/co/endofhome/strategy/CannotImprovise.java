package uk.co.endofhome.strategy;

public class CannotImprovise implements ImproviseBehaviour {

    @Override
    public void Improvise() {
        System.out.println("You what? Doesn't sound like music to me.");
    }
}
