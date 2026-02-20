import java.util.Scanner;

class Determinant5x5 {

    static int determinant(int a[][], int n) {
        int det = 0;

        if (n == 1)
            return a[0][0];

        int temp[][] = new int[5][5];
        int sign = 1;

        for (int f = 0; f < n; f++) {

            int subi = 0;
            for (int i = 1; i < n; i++) {
                int subj = 0;
                for (int j = 0; j < n; j++) {
                    if (j == f)
                        continue;
                    temp[subi][subj] = a[i][j];
                    subj++;
                }
                subi++;
            }

            det = det + sign * a[0][f] * determinant(temp, n - 1);
            sign = -sign;
        }

        return det;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[5][5];

        System.out.println("Enter elements of 5x5 matrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int result = determinant(mat, 5);
        System.out.println("Determinant = " + result);
        sc.close();
    }
}
