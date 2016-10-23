package uk.co.endofhome.singleton.classic;

public class SingletonThreadSafe {
    private static SingletonThreadSafe uniqueInstance;

    private SingletonThreadSafe() {}

    // This is thread safe but using *synchronised* makes this an expensive operation.

    public static synchronized SingletonThreadSafe getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonThreadSafe();
        }
        return uniqueInstance;
    }
}
