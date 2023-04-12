package ExamPractise1;

public class BoundedSemaphore {
    private int signals = 0;
    private int bound = 0;

    public BoundedSemaphore(int upperbound) {
        this.bound = upperbound;
    }

    public void synchorizedtake() throws InterruptedException {
        while (this.signals == bound) {
            wait();
            this.signals++;
            this.notify();
            InterruptedException InterruptedException;
                while (this.signals == 0) {
                    wait();
                    this.signals--;
                }
            }
        }
    }





