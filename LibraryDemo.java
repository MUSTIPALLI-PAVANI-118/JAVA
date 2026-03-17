class Book {
    private String title;
    private boolean isIssued;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued");
        } else {
            System.out.println("Already issued");
        }
    }

    public void returnBook() {
        isIssued = false;
        System.out.println("Book returned");
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b = new Book();

        b.setTitle("Java Programming");
        b.issueBook();
        b.returnBook();

        System.out.println("Book: " + b.getTitle());
        System.out.println("Issued: " + b.isIssued());
    }
}
