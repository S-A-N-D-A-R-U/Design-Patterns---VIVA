package observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Salary salary = new Salary();

        ManagerBonus managerBonus = new ManagerBonus();
        EmployeeBonus employeeBonus = new EmployeeBonus();

        salary.registerObserver(managerBonus);
        salary.registerObserver(employeeBonus);

        System.out.println("Setting salary to $5000:");
        salary.setSalary(5000);

        System.out.println("\nSetting salary to $8000:");
        salary.setSalary(8000);
    }
}

