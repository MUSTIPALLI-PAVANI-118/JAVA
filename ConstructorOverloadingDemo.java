class Book {

    String title;
    int price;

    // Constructor 1
    Book() {
        title = "Unknown";
        price = 0;
    }

    // Constructor 2
    Book(String t, int p) {
        title = t;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + " Price: " + price);
    }
}

public class ConstructorOverloadingDemo {

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java Programming", 500);

        b1.display();
        b2.display();

    }
}
