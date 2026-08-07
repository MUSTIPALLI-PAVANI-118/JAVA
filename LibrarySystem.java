import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean issued;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issueBook() {
        issued = true;
    }

    public void returnBook() {
        issued = false;
    }

    @Override
    public String toString() {
        String status = issued ? "Issued" : "Available";
        return "Book ID: " + bookId +
                " | Title: " + title +
                " | Author: " + author +
                " | Status: " + status;
    }
}

public class LibraryManagementSystem {

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book Added Successfully.");
    }

    public static void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is Empty.");
            return;
        }

        System.out.println("\n------ Library Books ------");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public static void searchBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.getBookId() == id) {
                System.out.println("Book Found:");
                System.out.println(b);
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void issueBook() {
        System.out.print("Enter Book ID to Issue: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.getBookId() == id) {
                if (!b.isIssued()) {
                    b.issueBook();
                    System.out.println("Book Issued Successfully.");
                } else {
                    System.out.println("Book is Already Issued.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void returnBook() {
        System.out.print("Enter Book ID to Return: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.getBookId() == id) {
                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book Returned Successfully.");
                } else {
                    System.out.println("Book is Already Available.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void deleteBook() {
        System.out.print("Enter Book ID to Delete: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.getBookId() == id) {
                books.remove(b);
                System.out.println("Book Deleted Successfully.");
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void menu() {

        while (true) {

            System.out.println("\n====== Library Management System ======");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

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
                    deleteBook();
                    break;

                case 7:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
