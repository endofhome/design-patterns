package uk.co.endofhome.strategy;

public class BlackSabbath extends Band {

    public BlackSabbath() {
        name = "Black Sabbath";
        rockOutBehavior = new SlowRock();
        improviseBehaviour = new CannotImprovise();
    }

    @Override
    public void members() {
        System.out.println("Tommy Iommi, Geezer Butler, Ozzy Osbourne and lest we forget... Bill Ward.");
    }
}
