package Singleton;

public class Runner {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.doSomething();
    }
}
