package uk.co.endofhome.singleton.classic;

public class SingletonClassic {
    private static SingletonClassic uniqueInstance;

    private SingletonClassic() {};

    public static SingletonClassic getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonClassic();
        }
        return uniqueInstance;
    }
}
