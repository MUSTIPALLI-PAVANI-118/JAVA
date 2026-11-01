import java.util.Scanner;

public class MetroFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stations: ");
        int stations = sc.nextInt();

        int fare;

        if (stations <= 2)
            fare = 10;
        else if (stations <= 5)
            fare = 20;
        else if (stations <= 10)
            fare = 30;
        else
            fare = 50;

        System.out.println("Total Metro Fare: Rs." + fare);

        sc.close();
    }
}
