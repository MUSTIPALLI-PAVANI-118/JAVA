import java.util.Scanner;

public class HostelFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hostel Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter Category (1-General, 2-Scholarship): ");
        int category = sc.nextInt();

        double discount;

        if (fee < 0) {
            System.out.println("Invalid Fee");
        } else if (category == 1) {
            discount = 0;
            System.out.println("Final Fee: " + fee);
        } else if (category == 2) {
            discount = fee * 0.20;
            System.out.println("Discount: " + discount);
            System.out.println("Final Fee: " + (fee - discount));
        } else {
            System.out.println("Invalid Category");
        }

        sc.close();
    }
}
