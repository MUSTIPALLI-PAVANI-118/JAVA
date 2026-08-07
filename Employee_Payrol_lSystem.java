import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double basicSalary;
    private double bonus;
    private double tax;

    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        calculateSalary();
    }

    public int getEmpId() {
        return empId;
    }

    public void calculateSalary() {
        bonus = basicSalary * 0.10;      // 10% Bonus
        tax = basicSalary * 0.05;        // 5% Tax
    }

    public double getNetSalary() {
        return basicSalary + bonus - tax;
    }

    public void displayEmployee() {
        System.out.println("----------------------------------------");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : ₹" + basicSalary);
        System.out.println("Bonus (10%)   : ₹" + bonus);
        System.out.println("Tax (5%)      : ₹" + tax);
        System.out.println("Net Salary    : ₹" + getNetSalary());
        System.out.println("----------------------------------------");
    }
}

public class EmployeePayrollSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        employees.add(new Employee(id, name, salary));

        System.out.println("Employee Added Successfully.");
    }

    public static Employee searchEmployee(int id) {

        for (Employee emp : employees) {
            if (emp.getEmpId() == id) {
                return emp;
            }
        }

        return null;
    }

    public static void displayEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee emp = searchEmployee(id);

        if (emp != null) {
            emp.displayEmployee();
        } else {
            System.out.println("Employee Not Found.");
        }
    }

    public static void displayAllEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No Employee Records Found.");
            return;
        }

        System.out.println("\n========== Employee Payroll ==========");

        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    public static void deleteEmployee() {

        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();

        Employee emp = searchEmployee(id);

        if (emp != null) {
            employees.remove(emp);
            System.out.println("Employee Deleted Successfully.");
        } else {
            System.out.println("Employee Not Found.");
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n========== Employee Payroll System ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployee();
                    break;

                case 3:
                    displayAllEmployees();
                    break;

                case 4:
                    deleteEmployee();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
