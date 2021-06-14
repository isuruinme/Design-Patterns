package Facade;

interface Runner{
    void run();
}

class Sprinters implements Runner{
    @Override
    public void run(){
        System.out.println("I am sprinting");
    }

    public void start(){
        System.out.println("Take start right");
    }
}

class RoadRunners implements Runner{
    @Override
    public void run(){
        System.out.println("I am road running");
    }

    public void breath(){
        System.out.println("I am breathing frequently");
    }
}

class Athlete {
    Sprinters sprinters;
    RoadRunners roadRunners;

    public Athlete(){
        sprinters = new Sprinters();
        roadRunners = new RoadRunners();
    }

    public void roadRunner(){
        roadRunners.run();
        roadRunners.breath();
    }

    public void sprint(){
        sprinters.start();
        sprinters.run();
    }
}

public class Facade{
    public static void main(String[] args) {
        Athlete a1 = new Athlete();
        a1.roadRunner();
        a1.sprint();
    }
}
