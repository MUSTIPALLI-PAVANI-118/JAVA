import java.util.Scanner;
import device.SmartDevice;

public class SmartHomeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Device Name: ");
        String name = sc.nextLine();

        SmartDevice d = new SmartDevice();
        d.setName(name);

        d.turnOn();
        d.showStatus();

        d.turnOff();
        d.showStatus();

        sc.close();
    }
}
