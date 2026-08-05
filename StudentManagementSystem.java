import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String course;
    double marks;

    Student(int id, String name, int age, String course, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("--------------------------------------------");
        System.out.println("Student ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);

        if (marks >= 90)
            System.out.println("Grade        : A");
        else if (marks >= 75)
            System.out.println("Grade        : B");
        else if (marks >= 60)
            System.out.println("Grade        : C");
        else
            System.out.println("Grade        : D");

        System.out.println("--------------------------------------------");
    }
}

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(id, name, age, course, marks));

        System.out.println("\nStudent Added Successfully!\n");
    }

    public static void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo Student Records Found.\n");
            return;
        }

        System.out.println("\n===== Student Records =====");

        for (Student s : students) {
            s.display();
        }
    }

    public static void searchStudent() {

        System.out.print("Enter Student ID to Search: ");
        int id = sc.nextInt();

        boolean found = false;

        for (Student s : students) {
            if (s.id == id) {
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void updateStudent() {

        System.out.print("Enter Student ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {

            if (s.id == id) {

                System.out.print("Enter New Name: ");
                s.name = sc.nextLine();

                System.out.print("Enter New Age: ");
                s.age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Course: ");
                s.course = sc.nextLine();

                System.out.print("Enter New Marks: ");
                s.marks = sc.nextDouble();

                System.out.println("Student Updated Successfully.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void deleteStudent() {

        System.out.print("Enter Student ID to Delete: ");
        int id = sc.nextInt();

        for (Student s : students) {

            if (s.id == id) {

                students.remove(s);
                System.out.println("Student Deleted Successfully.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void totalStudents() {
        System.out.println("\nTotal Students = " + students.size());
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Total Students");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    totalStudents();
                    break;

                case 7:
                    System.out.println("\nThank You for Using the System!");
                    break;

                default:
                    System.out.println("Invalid Choice. Try Again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
