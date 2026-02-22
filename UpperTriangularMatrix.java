import java.util.Scanner;

class UpperTriangularMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of matrix: ");
        int n = sc.nextInt();

        int mat[][] = new int[n][n];
        boolean isUpper = true;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Check elements below main diagonal
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (mat[i][j] != 0) {
                    isUpper = false;
                    break;
                }
            }
        }

        if (isUpper)
            System.out.println("Matrix is Upper Triangular");
        else
            System.out.println("Matrix is NOT Upper Triangular");

        sc.close();
    }
}
