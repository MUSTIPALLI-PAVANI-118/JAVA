
import java.util.Scanner;

public class RoomCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get room details
        System.out.print("Enter number of bedrooms: ");
        int bedrooms = sc.nextInt();

        System.out.print("Enter number of bathrooms: ");
        int bathrooms = sc.nextInt();

        System.out.print("Enter number of kitchens: ");
        int kitchens = sc.nextInt();

        System.out.print("Enter number of living rooms: ");
        int livingRooms = sc.nextInt();

        // Calculate total rooms
        int total = bedrooms + bathrooms + kitchens + livingRooms;

        System.out.println("Total Rooms in House: " + total);

        sc.close();
    }
}
