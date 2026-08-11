class Book {
    String title;
    Book(String title) { this.title = title; }
}

class Library {
    private Book[] books;
    private int count = 0;

    Library(int capacity) {
        books = new Book[capacity];
    }

    void addBook(Book b) {
        if (count < books.length) {
            books[count++] = b;
        }
    }

    void listBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].title);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library(3);
        lib.addBook(new Book("1984"));
        lib.addBook(new Book("Brave New World"));
        lib.listBooks();
    }
}
