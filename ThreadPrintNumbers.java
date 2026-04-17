class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("NumberThread: " + i);
        }
    }
}

class LetterThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("LetterThread: " + c);
        }
    }
}

public class ThreadPrintNumbers {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        LetterThread t2 = new LetterThread();

        t1.start();
        t2.start();
    }
}
