package uk.co.endofhome.observer;

import static java.lang.String.*;

public abstract class Opinionated {
    private final String name;

    protected Opinionated(String name) {
        this.name = name;
    }

    public void introduction() {
        System.out.println(format("%s says:", name.toUpperCase()));
    }

    public abstract void opinion();
}
