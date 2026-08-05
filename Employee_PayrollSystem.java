import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    int empId;
    String name;
    String department;
    double basicSalary;

    Employee(int empId, String name, String department, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    double calculateHRA() {
        return basicSalary * 0.20;
    }

    double calculateDA() {
        return basicSalary * 0.15;
    }

    double calculateTax() {
        return basicSalary * 0.10;
    }

    double calculateNetSalary() {
        return basicSalary + calculateHRA() + calculateDA() - calculateTax();
    }

    void displayEmployee() {

        System.out.println("------------------------------------------");
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + name);
        System.out.println("Department       : " + department);
        System.out.printf("Basic Salary     : ₹%.2f%n", basicSalary);
        System.out.printf("HRA (20%%)        : ₹%.2f%n", calculateHRA());
        System.out.printf("DA (15%%)         : ₹%.2f%n", calculateDA());
        System.out.printf("Tax (10%%)        : ₹%.2f%n", calculateTax());
        System.out.printf("Net Salary       : ₹%.2f%n", calculateNetSalary());
        System.out.println("------------------------------------------");
    }
}

public class EmployeePayrollSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    static Employee findEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.empId == id) {
                return emp;
            }
        }
        return null;
    }

    static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (findEmployee(id) != null) {
            System.out.println("Employee ID already exists.");
            return;
        }

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        employees.add(new Employee(id, name, department, salary));

        System.out.println("Employee Added Successfully.");
    }

    static void displayEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No Employee Records Found.");
            return;
        }

        System.out.println("\n========== EMPLOYEE DETAILS ==========");

        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    static void searchEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee emp = findEmployee(id);

        if (emp != null) {
            emp.displayEmployee();
        } else {
            System.out.println("Employee Not Found.");
        }
    }

    static void updateSalary() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee emp = findEmployee(id);

        if (emp == null) {
            System.out.println("Employee Not Found.");
            return;
        }

        System.out.print("Enter New Basic Salary: ");
        emp.basicSalary = sc.nextDouble();

        System.out.println("Salary Updated Successfully.");
    }

    static void removeEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee emp = findEmployee(id);

        if (emp != null) {
            employees.remove(emp);
            System.out.println("Employee Removed Successfully.");
        } else {
            System.out.println("Employee Not Found.");
        }
    }

    static void totalEmployees() {
        System.out.println("Total Employees: " + employees.size());
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== EMPLOYEE PAYROLL SYSTEM ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Remove Employee");
            System.out.println("6. Total Employees");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateSalary();
                    break;

                case 5:
                    removeEmployee();
                    break;

                case 6:
                    totalEmployees();
                    break;

                case 7:
                    System.out.println("Thank You for Using Employee Payroll System.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
