class Employee {
    int id;
    String name;
    String department;
    double basicSalary;

    Employee(int id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double grossSalary = basicSalary + hra + da;

        System.out.printf(
                "%-5d %-15s %-15s %.2f %.2f %.2f %.2f%n",
                id, name, department,
                basicSalary, hra, da, grossSalary
        );
    }
}

public class EmployeeSalaryProcessor {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(101, "Pavan", "IT", 45000),
                new Employee(102, "Rahul", "HR", 38000),
                new Employee(103, "Priya", "IT", 60000),
                new Employee(104, "Arun", "Finance", 42000)
        };

        System.out.printf(
                "%-5s %-15s %-15s %-10s %-10s %-10s %-10s%n",
                "ID", "Name", "Department",
                "Basic", "HRA", "DA", "Gross"
        );

        System.out.println("--------------------------------------------------------------------------");

        for (Employee employee : employees) {
            employee.calculateSalary();
        }
    }
}
