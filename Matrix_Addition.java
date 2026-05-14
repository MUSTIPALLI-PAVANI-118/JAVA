import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = 2;
        int cols = 2;

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                result[i][j] =
                        matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Result Matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
