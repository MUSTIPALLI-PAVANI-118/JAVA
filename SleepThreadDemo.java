import java.util.Scanner;

class NumberThread extends Thread {
    int start;
    int end;
    int delay;

    NumberThread(int start, int end, int delay) {
        this.start = start;
        this.end = end;
        this.delay = delay;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class SleepThreadDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        System.out.print("Enter delay in milliseconds: ");
        int delay = sc.nextInt();

        NumberThread t1 = new NumberThread(start, end, delay);
        t1.start();

        sc.close();
    }
}