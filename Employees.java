public class Employee {
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.id = id;
        setSalary(salary);
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getId() { return id; }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Ravi", 50000, 101);
        System.out.println(e.getName() + " earns " + e.getSalary());
    }
}
