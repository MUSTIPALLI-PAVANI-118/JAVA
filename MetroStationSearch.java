import java.util.Scanner;

public class MetroStationSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] stations = {
            "Central", "Egmore", "Guindy",
            "Airport", "Koyambedu"
        };

        System.out.print("Enter station name: ");
        String search = sc.nextLine();

        boolean found = false;

        for (String station : stations) {
            if (station.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Station Found");
        else
            System.out.println("Station Not Found");

        sc.close();
    }
}
