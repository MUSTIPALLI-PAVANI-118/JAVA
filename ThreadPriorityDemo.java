import java.util.Scanner;

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running");
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter priority for Thread 1 (1 to 10): ");
        int p1 = sc.nextInt();

        System.out.print("Enter priority for Thread 2 (1 to 10): ");
        int p2 = sc.nextInt();

        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");

        t1.setPriority(p1);
        t2.setPriority(p2);

        t1.start();
        t2.start();

        sc.close();
    }
}