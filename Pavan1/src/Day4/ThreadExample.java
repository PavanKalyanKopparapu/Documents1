package Day4;
public class ThreadExample extends Thread {
    public void run() {
        int a = 10;
        int b = 12;
        int result = a + b;
        System.out.println("Thread started running..");
        System.out.println("sum of two numbers is :" + result);
        try {
            threadsleep();
        } catch (Exception e) {
        }
    }

    public static void threadsleep() throws InterruptedException {
        sleep(100);
    }

public static void main(String[] args)throws InterruptedException {
    ThreadExample t1 = new ThreadExample();
    t1.start();
    t1.start();
    sleep(100);
    ThreadExample t2 = new ThreadExample();
    t2.start();
    t2.join();
    System.out.println("Main Thread");
}

}