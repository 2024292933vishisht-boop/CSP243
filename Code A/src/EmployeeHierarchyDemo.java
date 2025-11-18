import java.util.Scanner;

class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name; this.address = address; this.salary = salary; this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.05; // base bonus 5%
    }

    public void printDetails() {
        System.out.println(jobTitle + " - " + name + ", " + address + ", Salary: " + salary + ", Bonus: " + calculateBonus());
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }
    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }
    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }
    @Override
    public double calculateBonus() {
        return salary * 0.08;
    }
}

public class EmployeeHierarchyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter address:");
        String addr = sc.nextLine();
        System.out.println("Enter salary:");
        double sal = sc.nextDouble();
        sc.nextLine();
        System.out.println("Choose role: 1-Manager 2-Developer 3-Programmer");
        int ch = sc.nextInt();

        Employee e;
        if (ch == 1) e = new Manager(name, addr, sal);
        else if (ch == 2) e = new Developer(name, addr, sal);
        else e = new Programmer(name, addr, sal);

        e.printDetails();
    }
}
