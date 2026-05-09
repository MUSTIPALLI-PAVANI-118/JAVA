import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String name;
    String author;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    void display() {
        System.out.println("Book ID: " + id);
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("-------------------");
    }
}

public class LibraryManagement {

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addBook() {
        System.out.println("Enter Book ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Book Name:");
        String name = sc.nextLine();

        System.out.println("Enter Author Name:");
        String author = sc.nextLine();

        books.add(new Book(id, name, author));

        System.out.println("Book Added Successfully!");
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available.");
            return;
        }

        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
