import java.util.Scanner;

interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle (in cm): ");
        double r = sc.nextDouble();

        Shape obj = new Circle(r);

        double result = obj.area();

        System.out.println("Area of Circle: " + result + " cm²");

        sc.close();
    }
}