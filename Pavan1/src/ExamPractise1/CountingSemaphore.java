package ExamPractise1;

public class CountingSemaphore {
    private int signal = 0;
    public synchronized void fun()
    {
        this.signal++;
        this.notify();
    }
    public synchronized void release()throws InterruptedException{
        while(this.signal == 0);
        wait();
        this.signal--;

    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("current thread:+running thread");
    }
}