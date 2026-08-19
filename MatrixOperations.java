public class MatrixOperations {

    static void displayMatrix(int[][] matrix) {

        for (int[] row : matrix) {

            for (int value : row) {
                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }

    static int[][] addMatrices(
            int[][] a,
            int[][] b) {

        int rows = a.length;
        int columns = a[0].length;

        int[][] result =
                new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[i][j] =
                        a[i][j] + b[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrixA = {
                {1, 2},
                {3, 4}
        };

        int[][] matrixB = {
                {5, 6},
                {7, 8}
        };

        int[][] result =
                addMatrices(matrixA, matrixB);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        System.out.println("\nA + B:");
        displayMatrix(result);
    }
}
