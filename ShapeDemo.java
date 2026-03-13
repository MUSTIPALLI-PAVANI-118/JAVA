class Shape {
    void area() {
        System.out.println("Area calculation");
    }
}

class Rectangle extends Shape {
    int length = 10;
    int breadth = 5;

    void findArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
        r.findArea();
    }
}
