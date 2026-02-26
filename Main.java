import java.util.Scanner;

class Student {
    String name;
    double marks;  

    // METHOD - DISPLAY STUDENT DETAILS
    void displayDetails() {
        System.out.println("\n Student Details:");
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // OBJECT CREATION
        Student s1 = new Student();

        // INPUT FROM USER
        System.out.print("Enter Student Name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter Marks: ");
        s1.marks = sc.nextDouble();

        // OUTPUT:
        s1.displayDetails();

        sc.close();
    }
}
