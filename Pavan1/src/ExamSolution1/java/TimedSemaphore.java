package ExamSolution1.java;



class TimedSemaphore {
    public static void main(String[] args) {
        System.out.println("Type of semaphore : Timed semapore ");

    }
    private static final int SECONDS = 1000;
    private TimedSemaphore semaphore;


    TimedSemaphore(long period, int slotLimit) {
        semaphore = new TimedSemaphore(slotLimit, SECONDS);

    }

    boolean tryAdd() {
        return semaphore.tryAcquire();
    }

    private boolean tryAcquire() {
        return false;
    }



    int availableSlots()
    {
        return semaphore.getAvailablePermits();
    }

    private int getAvailablePermits() {
        return 0;
    }
}
