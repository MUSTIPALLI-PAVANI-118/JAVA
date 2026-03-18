import java.util.Scanner;

// Interface
interface Printer {
    void print();
}

// Text Printer
class TextPrinter implements Printer {
    public void print() {
        System.out.println("Printing text document...");
    }
}

// Image Printer
class ImagePrinter implements Printer {
    public void print() {
        System.out.println("Printing image...");
    }
}

// Main class
public class PrinterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Printer Type:");
        System.out.println("1. Text Printer");
        System.out.println("2. Image Printer");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        Printer printer;  // interface reference

        // Decision making
        if (choice == 1) {
            printer = new TextPrinter();
        } else if (choice == 2) {
            printer = new ImagePrinter();
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        // Runtime polymorphism
        printer.print();

        sc.close();
    }
}