import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    String category;
    boolean available;

    Book(
            int id,
            String title,
            String author,
            String category,
            boolean available) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.available = available;
    }

    void display() {

        System.out.printf(
                "%-5d %-20s %-15s %-15s %-10s%n",
                id,
                title,
                author,
                category,
                available ? "Available" : "Borrowed"
        );
    }
}

public class LibrarySearchEngine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(
                101,
                "Java Programming",
                "James",
                "Programming",
                true
        ));

        books.add(new Book(
                102,
                "Clean Code",
                "Robert",
                "Programming",
                false
        ));

        books.add(new Book(
                103,
                "Atomic Habits",
                "James",
                "Self Help",
                true
        ));

        books.add(new Book(
                104,
                "Effective Java",
                "Joshua",
                "Programming",
                true
        ));

        System.out.print(
                "Enter title/author/category to search: "
        );

        String search = sc.nextLine().toLowerCase();

        boolean found = false;

        System.out.println("\n===== SEARCH RESULTS =====");

        for (Book book : books) {

            if (book.title.toLowerCase().contains(search)
                    || book.author.toLowerCase().contains(search)
                    || book.category.toLowerCase().contains(search)) {

                book.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found.");
        }

        sc.close();
    }
}
