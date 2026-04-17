class JoinThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class ThreadJoinExample {
    public static void main(String[] args) {
        JoinThread t1 = new JoinThread();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread finished after child thread");
    }
}
