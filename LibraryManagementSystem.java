import java.util.ArrayList;

class Book {

    int id;
    String title;
    boolean issued;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.issued = false;
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1, "Java Basics"));
        books.add(new Book(2, "Data Structures"));

        System.out.println("Available Books:");

        for (Book b : books) {

            if (!b.issued) {
                System.out.println(b.id + " - " + b.title);
            }
        }

        books.get(0).issued = true;

        System.out.println("\nAfter Issuing Book:");

        for (Book b : books) {

            System.out.println(
                    b.id + " - " + b.title + " - Issued: " + b.issued);
        }
    }
}
