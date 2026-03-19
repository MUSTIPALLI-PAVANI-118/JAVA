class Calculator {

    // Method with 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double values
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of doubles: " + calc.add(5.5, 2.3));
    }
}
