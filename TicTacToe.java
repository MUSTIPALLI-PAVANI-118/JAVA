import java.util.Scanner;

public class import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';
        int movesLeft = 9;
        boolean won = false;

        while (movesLeft > 0 && !won) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter a position (1-9): ");
            int pos = sc.nextInt();

            int row = (pos - 1) / 3;
            int col = (pos - 1) % 3;

            if (pos < 1 || pos > 9 || board[row][col] == 'X' || board[row][col] == 'O') {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[row][col] = currentPlayer;
            movesLeft--;

            won = checkWin(currentPlayer);

            if (!won) {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        printBoard();
        if (won) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw!");
        }

        sc.close();
    }

    static void printBoard() {
        System.out.println();
        for (char[] row : board) {
            System.out.println(row[0] + " | " + row[1] + " | " + row[2]);
        }
        System.out.println();
    }

    static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }
}{
    static char[][] board = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';
        int movesLeft = 9;
        boolean won = false;

        while (movesLeft > 0 && !won) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter a position (1-9): ");
            int pos = sc.nextInt();

            int row = (pos - 1) / 3;
            int col = (pos - 1) % 3;

            if (pos < 1 || pos > 9 || board[row][col] == 'X' || board[row][col] == 'O') {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[row][col] = currentPlayer;
            movesLeft--;

            won = checkWin(currentPlayer);

            if (!won) {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        printBoard();
        if (won) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw!");
        }

        sc.close();
    }

    static void printBoard() {
        System.out.println();
        for (char[] row : board) {
            System.out.println(row[0] + " | " + row[1] + " | " + row[2]);
        }
        System.out.println();
    }

    static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }
}
