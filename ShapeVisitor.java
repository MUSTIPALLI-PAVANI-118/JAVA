interface Visitor {
    void visit(Circle c);
    void visit(Square s);
}

interface ShapeElement {
    void accept(Visitor v);
}

class Circle implements ShapeElement {
    double radius;
    Circle(double radius) { this.radius = radius; }
    public void accept(Visitor v) { v.visit(this); }
}

class Square implements ShapeElement {
    double side;
    Square(double side) { this.side = side; }
    public void accept(Visitor v) { v.visit(this); }
}

class AreaVisitor implements Visitor {
    public void visit(Circle c) {
        System.out.println("Circle area: " + (Math.PI * c.radius * c.radius));
    }
    public void visit(Square s) {
        System.out.println("Square area: " + (s.side * s.side));
    }
}

public class ShapeVisitor {
    public static void main(String[] args) {
        ShapeElement[] shapes = { new Circle(4), new Square(5) };
        Visitor areaVisitor = new AreaVisitor();
        for (ShapeElement s : shapes) {
            s.accept(areaVisitor);
        }
    }
}
