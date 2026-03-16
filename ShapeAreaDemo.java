abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius = 5;

    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 4;
    double width = 6;

    double area() {
        return length * width;
    }
}

public class ShapeAreaDemo {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println("Area of Circle: " + s1.area());
        System.out.println("Area of Rectangle: " + s2.area());
    }
}
