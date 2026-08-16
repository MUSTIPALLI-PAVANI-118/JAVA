class Worker implements Runnable {
    private String taskName;

    Worker(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " - step " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Worker("Task A"));
        Thread t2 = new Thread(new Worker("Task B"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("All tasks completed");
    }
}
