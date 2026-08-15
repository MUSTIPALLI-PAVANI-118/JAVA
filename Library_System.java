import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    boolean available;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    void display() {
        System.out.printf(
            "%-5d %-25s %-20s %-10s%n",
            id, title, author, available ? "Available" : "Borrowed"
        );
    }
}

public class Library_System {

    static ArrayList<Book> books = new ArrayList<>();

    static void displayBooks() {
        System.out.printf(
            "%-5s %-25s %-20s %-10s%n",
            "ID", "Title", "Author", "Status"
        );

        System.out.println("------------------------------------------------------------");

        for (Book book : books) {
            book.display();
        }
    }

    static void borrowBook(int id) {
        for (Book book : books) {
            if (book.id == id) {

                if (book.available) {
                    book.available = false;
                    System.out.println("Book borrowed successfully.");
                } else {
                    System.out.println("Book is already borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    static void returnBook(int id) {
        for (Book book : books) {
            if (book.id == id) {

                if (!book.available) {
                    book.available = true;
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        books.add(new Book(101, "Java Programming", "James Gosling"));
        books.add(new Book(102, "Clean Code", "Robert Martin"));
        books.add(new Book(103, "Effective Java", "Joshua Bloch"));

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayBooks();
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    borrowBook(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    returnBook(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Thank you for using the library system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
