// Parent class
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    // Method to be overridden
    double calculateSalary() {
        return 0;
    }
}

// Child class 1
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.monthlySalary = salary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

// Child class 2
class PartTimeEmployee extends Employee {
    double hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, double hours, double rate) {
        super(name);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class
public class EmployeeSalaryDemo {
    public static void main(String[] args) {

        // Array of parent type
        Employee[] employees = new Employee[2];

        employees[0] = new FullTimeEmployee("Alice", 50000);
        employees[1] = new PartTimeEmployee("Bob", 20, 500);

        for (Employee emp : employees) {
            System.out.println(emp.name + " Salary: " + emp.calculateSalary());
        }
    }
}
