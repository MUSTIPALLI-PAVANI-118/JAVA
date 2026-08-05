import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    boolean issued;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    void displayBook() {
        System.out.println("----------------------------------------");
        System.out.println("Book ID      : " + bookId);
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Status       : " + (issued ? "Issued" : "Available"));
        System.out.println("----------------------------------------");
    }
}

public class LibraryManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    static Book findBook(int id) {
        for (Book b : books) {
            if (b.bookId == id) {
                return b;
            }
        }
        return null;
    }

    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (findBook(id) != null) {
            System.out.println("Book ID already exists.");
            return;
        }

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));

        System.out.println("Book Added Successfully.");
    }

    static void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No Books Available.");
            return;
        }

        System.out.println("\n========== LIBRARY BOOKS ==========");

        for (Book b : books) {
            b.displayBook();
        }
    }

    static void searchBook() {

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book b = findBook(id);

        if (b != null) {
            b.displayBook();
        } else {
            System.out.println("Book Not Found.");
        }
    }

    static void issueBook() {

        System.out.print("Enter Book ID to Issue: ");
        int id = sc.nextInt();

        Book b = findBook(id);

        if (b == null) {
            System.out.println("Book Not Found.");
        } else if (b.issued) {
            System.out.println("Book Already Issued.");
        } else {
            b.issued = true;
            System.out.println("Book Issued Successfully.");
        }
    }

    static void returnBook() {

        System.out.print("Enter Book ID to Return: ");
        int id = sc.nextInt();

        Book b = findBook(id);

        if (b == null) {
            System.out.println("Book Not Found.");
        } else if (!b.issued) {
            System.out.println("Book is Already Available.");
        } else {
            b.issued = false;
            System.out.println("Book Returned Successfully.");
        }
    }

    static void removeBook() {

        System.out.print("Enter Book ID to Remove: ");
        int id = sc.nextInt();

        Book b = findBook(id);

        if (b != null) {
            books.remove(b);
            System.out.println("Book Removed Successfully.");
        } else {
            System.out.println("Book Not Found.");
        }
    }

    static void totalBooks() {
        System.out.println("Total Books in Library: " + books.size());
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== LIBRARY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Total Books");
            System.out.println("8. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    issueBook();
                    break;

                case 5:
                    returnBook();
                    break;

                case 6:
                    removeBook();
                    break;

                case 7:
                    totalBooks();
                    break;

                case 8:
                    System.out.println("Thank You for Using Library Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 8);

        sc.close();
    }
}
