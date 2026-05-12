import java.util.Scanner;

class Weather {

    String city;
    int temperature;
    int humidity;

    Weather(String city, int temperature, int humidity) {

        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    void displayWeather() {

        System.out.println("\nCity: " + city);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");

        if (temperature > 35) {
            System.out.println("Condition: Hot");
        } else {
            System.out.println("Condition: Normal");
        }
    }
}

public class WeatherInformationApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter City Name: ");
        String city = sc.nextLine();

        System.out.print("Enter Temperature: ");
        int temp = sc.nextInt();

        System.out.print("Enter Humidity: ");
        int humidity = sc.nextInt();

        Weather w = new Weather(city, temp, humidity);

        w.displayWeather();

        sc.close();
    }
}
