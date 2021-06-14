package Observer;

import java.util.ArrayList;
import java.util.List;

interface Observable{
    public void addObserver( Observer observer );
    public void removeObserver( Observer observer );
    public void notifyObservers();
}

interface Observer{
    public void Update(Observable observable);
}

class Temperature implements Observable{
    private int value;
    private final List<Observer> observers;

    Temperature(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.Update(this);
        }
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }
}

class AirCondition implements Observer{

    @Override
    public void Update(Observable observable) {
        System.out.println("Temperature changed in air condition");
    }
}

class Display implements Observer{

    @Override
    public void Update(Observable observable) {
        Temperature temperature = (Temperature) observable;
        System.out.println("Temperature is now: " + temperature.getValue());
    }
}

class Notification implements Observer{

    @Override
    public void Update(Observable observable) {
        Temperature temperature = (Temperature) observable;
        System.out.println("Notification: " + temperature.getValue());
    }
}

public class ObserverRunner {
    public static void main(String[] args) {
        Temperature temp = new Temperature();

        AirCondition airCondition = new AirCondition();
        Display display = new Display();
        Notification notification = new Notification();
        System.out.println("Step 1:");
        temp.addObserver(airCondition);
        System.out.println("Step 2:");
        temp.addObserver(display);
        temp.addObserver(notification);
        temp.setValue(20);
    }
}
