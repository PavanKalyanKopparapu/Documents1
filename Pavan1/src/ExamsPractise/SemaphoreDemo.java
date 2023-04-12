package ExamsPractise;
import java.util.concurrent.*;
class   Task implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Being run by " + Thread.currentThread().getName());
            for (int i = 0; i < 5; i++) {
                System.out.println("Running Thread " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }

            Throwable e = null;
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        class SemaphoreDemo {
            public static void main(String[] args) {
                Task task = new Task();
                Thread t1 = new Thread(task);
                Thread t2 = new Thread(task);
                t1.setName("Thread1");
                t2.setName("Thread2");
                t1.start();
                t2.start();

            }
        }
    }
}







