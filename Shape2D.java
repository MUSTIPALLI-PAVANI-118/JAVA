public class Shape2D {
    private String name;

    Shape2D(String name) {
        this.name = name;
    }

    // Inner class (non-static) - tied to outer instance
    class Dimensions {
        double width, height;

        Dimensions(double width, double height) {
            this.width = width;
            this.height = height;
        }

        void show() {
            System.out.println(name + " -> width: " + width + ", height: " + height);
        }
    }

    // Static nested class - independent of outer instance
    static class Utility {
        static double calculateArea(double w, double h) {
            return w * h;
        }
    }

    public static void main(String[] args) {
        Shape2D shape = new Shape2D("Rectangle");
        Shape2D.Dimensions dim = shape.new Dimensions(5, 10);
        dim.show();

        double area = Utility.calculateArea(5, 10);
        System.out.println("Area: " + area);
    }
}
