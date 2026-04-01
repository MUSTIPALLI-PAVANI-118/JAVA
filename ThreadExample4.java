class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread B: " + i);
        }
    }
}

public class ThreadExample4 {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.start();
        t2.start();
    }
}
