class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.10;
    }

    double calculateTax() {
        return salary * 0.05;
    }

    void generateSlip() {

        double bonus = calculateBonus();
        double tax = calculateTax();

        double finalSalary = salary + bonus - tax;

        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Tax: " + tax);
        System.out.println("Final Salary: " + finalSalary);
    }
}

public class EmployeePayrollSystem {

    public static void main(String[] args) {

        Employee emp = new Employee("Pavani", 50000);

        emp.generateSlip();
    }
}
