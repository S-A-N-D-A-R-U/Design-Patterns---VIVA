package observer;

public class ManagerBonus implements Observer {
    private double managerBonus;

    @Override
    public void update(double salary) {
        managerBonus = salary * 0.20;
        display();
    }

    public void display() {
        System.out.println("Manager's Bonus: $" + managerBonus);
    }
}



