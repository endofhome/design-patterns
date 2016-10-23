package uk.co.endofhome.singleton.classic;

public class SingletonClassic {
    private static SingletonClassic uniqueInstance;

    private SingletonClassic() {};

    // nb. This is not thread safe!

    public static SingletonClassic getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonClassic();
        }
        return uniqueInstance;
    }
}
