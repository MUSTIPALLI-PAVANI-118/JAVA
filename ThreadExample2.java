class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }
        }
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
