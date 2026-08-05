import java.util.ArrayList;
import java.util.Scanner;

class Room {
    int roomNumber;
    String customerName;
    int numberOfDays;
    boolean isBooked;

    Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.customerName = "";
        this.numberOfDays = 0;
        this.isBooked = false;
    }

    double calculateBill() {
        return numberOfDays * 1500.0;
    }

    void displayRoom() {
        System.out.println("--------------------------------------");
        System.out.println("Room Number   : " + roomNumber);

        if (isBooked) {
            System.out.println("Customer Name : " + customerName);
            System.out.println("Days Stayed   : " + numberOfDays);
            System.out.printf("Total Bill    : ₹%.2f%n", calculateBill());
            System.out.println("Status        : Booked");
        } else {
            System.out.println("Status        : Available");
        }

        System.out.println("--------------------------------------");
    }
}

public class HotelReservationSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Room> rooms = new ArrayList<>();

    static {
        for (int i = 101; i <= 110; i++) {
            rooms.add(new Room(i));
        }
    }

    static Room findRoom(int roomNo) {
        for (Room room : rooms) {
            if (room.roomNumber == roomNo) {
                return room;
            }
        }
        return null;
    }

    static void bookRoom() {
        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();
        sc.nextLine();

        Room room = findRoom(roomNo);

        if (room == null) {
            System.out.println("Invalid Room Number.");
            return;
        }

        if (room.isBooked) {
            System.out.println("Room is Already Booked.");
            return;
        }

        System.out.print("Enter Customer Name: ");
        room.customerName = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        room.numberOfDays = sc.nextInt();

        room.isBooked = true;

        System.out.println("Room Booked Successfully.");
    }

    static void checkoutRoom() {
        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();

        Room room = findRoom(roomNo);

        if (room == null) {
            System.out.println("Invalid Room Number.");
            return;
        }

        if (!room.isBooked) {
            System.out.println("Room is Already Vacant.");
            return;
        }

        System.out.printf("Final Bill: ₹%.2f%n", room.calculateBill());

        room.customerName = "";
        room.numberOfDays = 0;
        room.isBooked = false;

        System.out.println("Checkout Completed Successfully.");
    }

    static void displayAvailableRooms() {
        System.out.println("\n===== Available Rooms =====");

        boolean available = false;

        for (Room room : rooms) {
            if (!room.isBooked) {
                room.displayRoom();
                available = true;
            }
        }

        if (!available) {
            System.out.println("No Rooms Available.");
        }
    }

    static void displayBookedRooms() {
        System.out.println("\n===== Booked Rooms =====");

        boolean booked = false;

        for (Room room : rooms) {
            if (room.isBooked) {
                room.displayRoom();
                booked = true;
            }
        }

        if (!booked) {
            System.out.println("No Rooms are Currently Booked.");
        }
    }

    static void searchRoom() {
        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();

        Room room = findRoom(roomNo);

        if (room != null) {
            room.displayRoom();
        } else {
            System.out.println("Room Not Found.");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== HOTEL RESERVATION SYSTEM ==========");
            System.out.println("1. Book Room");
            System.out.println("2. Checkout Room");
            System.out.println("3. Display Available Rooms");
            System.out.println("4. Display Booked Rooms");
            System.out.println("5. Search Room");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bookRoom();
                    break;

                case 2:
                    checkoutRoom();
                    break;

                case 3:
                    displayAvailableRooms();
                    break;

                case 4:
                    displayBookedRooms();
                    break;

                case 5:
                    searchRoom();
                    break;

                case 6:
                    System.out.println("Thank You for Using Hotel Reservation System.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
