package uk.co.endofhome.singleton.classic;

public class SingletonStaticallyInitialised {
    private static SingletonStaticallyInitialised uniqueInstance = new SingletonStaticallyInitialised();

    private SingletonStaticallyInitialised() {}

    public static SingletonStaticallyInitialised getInstance() {
        return uniqueInstance;
    }

    public String description = "Statically initalised Singleton";
}
