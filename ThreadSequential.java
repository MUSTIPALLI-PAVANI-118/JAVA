import java.util.Scanner;
class NumberThread extends Thread {
    int start, end;
    NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class ThreadSequential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end for first thread: ");
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        System.out.print("Enter start and end for second thread: ");
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();
        NumberThread t1 = new NumberThread(s1, e1);
        NumberThread t2 = new NumberThread(s2, e2);
        try {
            t1.start();
            t1.join();   // wait until first thread finishes
            t2.start();
            t2.join();   // wait until second thread finishes
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        sc.close();
    }
}