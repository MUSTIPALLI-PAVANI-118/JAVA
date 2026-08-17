import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void display() {
        System.out.println("Name: " + name + " | Phone: " + phone);
    }
}

public class ContactManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Rahul", "9876543210"));
        contacts.add(new Contact("Priya", "9123456780"));

        System.out.println("===== CONTACT LIST =====");

        for (Contact contact : contacts) {
            contact.display();
        }

        System.out.print("\nEnter name to search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (Contact contact : contacts) {
            if (contact.name.equalsIgnoreCase(search)) {
                contact.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }

        sc.close();
    }
}
