
import java.util.concurrent.*;
class semaphore implements Runnable{
    @Override
    public void run() {
        System.out.println("run Thread" + Thread.currentThread().getName());
        for(int i=0;i<=10;i++)
        {
            System.out.println("Running... Thread" + Thread.currentThread().getName());
            throwbal e=null;
            e.prinTrackTrace();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }

        }

}
public static class Practical4 {
    public static void main(String[] args) {
        Practical4 task = new Practical4();
        Thread t1;
        String semaphore;
        semaphore = null;
        t1 = new Thread(semaphore);
        Thread t2 = new Thread(semaphore);
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();




    }
}
