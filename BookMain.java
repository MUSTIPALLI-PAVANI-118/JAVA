import java.util.Scanner;
class Book 
{
    String title;
    String author;
    // METHOD - DISPLAY BOOK DETAILS
    void display() {
        System.out.println("\n Book Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}
public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CREATING FIRST BOOK OBJECT
        Book b1 = new Book();
        System.out.println("Enter Details For Book 1:");
        System.out.print("Enter Title: ");
        b1.title = sc.nextLine();
        System.out.print("Enter Author: ");
        b1.author = sc.nextLine();

        // CREATE SECOND BOOK OBJECT
        Book b2 = new Book();
        System.out.println("\nEnter Details For Book 2:");
        System.out.print("Enter Title: ");
        b2.title = sc.nextLine();
        System.out.print("Enter Author: ");
        b2.author = sc.nextLine();

        // OUTPUT:
        System.out.println("OUTPUT:");
        b1.display();
        b2.display();

        sc.close();
    }
}

