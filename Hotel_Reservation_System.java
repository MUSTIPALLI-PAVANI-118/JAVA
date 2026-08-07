import java.util.ArrayList;
import java.util.Scanner;

class Room {
    private int roomNumber;
    private String customerName;
    private boolean booked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.customerName = "";
        this.booked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return booked;
    }

    public void bookRoom(String customerName) {
        this.customerName = customerName;
        this.booked = true;
    }

    public void cancelBooking() {
        this.customerName = "";
        this.booked = false;
    }

    public void displayRoom() {
        System.out.println("-------------------------------------");
        System.out.println("Room Number : " + roomNumber);

        if (booked) {
            System.out.println("Status      : Booked");
            System.out.println("Customer    : " + customerName);
        } else {
            System.out.println("Status      : Available");
        }

        System.out.println("-------------------------------------");
    }
}

public class HotelReservationSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Room> rooms = new ArrayList<>();

    public static void initializeRooms() {
        for (int i = 101; i <= 110; i++) {
            rooms.add(new Room(i));
        }
    }

    public static Room searchRoom(int roomNo) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNo) {
                return room;
            }
        }
        return null;
    }

    public static void bookRoom() {
        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();
        sc.nextLine();

        Room room = searchRoom(roomNo);

        if (room == null) {
            System.out.println("Room Not Found.");
            return;
        }

        if (room.isBooked()) {
            System.out.println("Room Already Booked.");
            return;
        }

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        room.bookRoom(name);

        System.out.println("Room Booked Successfully.");
    }

    public static void cancelBooking() {

        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();

        Room room = searchRoom(roomNo);

        if (room == null) {
            System.out.println("Room Not Found.");
            return;
        }

        if (!room.isBooked()) {
            System.out.println("Room is Already Available.");
            return;
        }

        room.cancelBooking();

        System.out.println("Booking Cancelled Successfully.");
    }

    public static void displayAllRooms() {

        System.out.println("\n========== HOTEL ROOMS ==========");

        for (Room room : rooms) {
            room.displayRoom();
        }
    }

    public static void searchRoomDetails() {

        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();

        Room room = searchRoom(roomNo);

        if (room != null) {
            room.displayRoom();
        } else {
            System.out.println("Room Not Found.");
        }
    }

    public static void availableRooms() {

        System.out.println("\nAvailable Rooms");

        boolean found = false;

        for (Room room : rooms) {

            if (!room.isBooked()) {
                System.out.println("Room " + room.getRoomNumber());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Rooms Available.");
        }
    }

    public static void main(String[] args) {

        initializeRooms();

        while (true) {

            System.out.println("\n========== HOTEL RESERVATION SYSTEM ==========");
            System.out.println("1. Book Room");
            System.out.println("2. Cancel Booking");
            System.out.println("3. Search Room");
            System.out.println("4. Display All Rooms");
            System.out.println("5. Show Available Rooms");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bookRoom();
                    break;

                case 2:
                    cancelBooking();
                    break;

                case 3:
                    searchRoomDetails();
                    break;

                case 4:
                    displayAllRooms();
                    break;

                case 5:
                    availableRooms();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
