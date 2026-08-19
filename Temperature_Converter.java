import java.util.Scanner;

public class TemperatureConverter {

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== TEMPERATURE CONVERTER =====");
        System.out.println("1. Celsius → Fahrenheit");
        System.out.println("2. Fahrenheit → Celsius");
        System.out.println("3. Celsius → Kelvin");
        System.out.println("4. Kelvin → Celsius");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        double result;

        switch (choice) {

            case 1:
                result = celsiusToFahrenheit(temperature);
                System.out.printf(
                        "Result: %.2f °F%n", result
                );
                break;

            case 2:
                result = fahrenheitToCelsius(temperature);
                System.out.printf(
                        "Result: %.2f °C%n", result
                );
                break;

            case 3:
                result = celsiusToKelvin(temperature);
                System.out.printf(
                        "Result: %.2f K%n", result
                );
                break;

            case 4:
                result = kelvinToCelsius(temperature);
                System.out.printf(
                        "Result: %.2f °C%n", result
                );
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
