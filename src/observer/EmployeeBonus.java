package observer;

public class EmployeeBonus implements Observer {
    private double employeeBonus;

    @Override
    public void update(double salary) {
        employeeBonus = salary * 0.10;
        display();
    }

    public void display() {
        System.out.println("Employee's Bonus: $" + employeeBonus);
    }
}