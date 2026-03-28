import java.util.Scanner;

public class ResourceManagementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);

            int[] arr = {10, 20, 30};
            System.out.println("Access element: " + arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } catch (Exception e) {
            System.out.println("General error");
        } finally {
            System.out.println("Releasing resources");
            sc.close();
        }
    }
}

