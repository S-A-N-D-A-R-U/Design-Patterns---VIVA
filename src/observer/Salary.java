package observer;

import java.util.ArrayList;
import java.util.List;

public class Salary implements Subject {
    private List<Observer> observers;
    private double salary;

    public Salary() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(salary);
        }
    }
//The setSalary method updates the salary and notifies all registered observers of the change.
    public void setSalary(double salary) {
        this.salary = salary;
        notifyObservers();
    }
}

