abstract class Employee {
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {

    void calculateSalary() {
        int salary = 50000;
        System.out.println("Full Time Employee Salary = " + salary);
    }
}

class PartTimeEmployee extends Employee {

    void calculateSalary() {
        int hours = 20;
        int rate = 500;
        int salary = hours * rate;

        System.out.println("Part Time Employee Salary = " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        e1.calculateSalary();
        e2.calculateSalary();

    }
}
