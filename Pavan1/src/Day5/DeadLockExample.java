package Day5;
public class DeadLockExample {
        public static void main(String[] args) {
            final String resource1 = "Pavan kalyan";
            final String resource2 = "Raji";
            Thread t1 = new Thread() {
                public void run() {
                    synchronized (resource1) {
                        System.out.println("Thread 1: Switch ON");

                        try { Thread.sleep(100);} catch (Exception e) {}

                        synchronized (resource2) {
                            System.out.println("Thread 2: Switch ON ");
                        }
                    }
                }
            };

            Thread t2 = new Thread() {
                public void run() {
                    synchronized (resource2) {
                        System.out.println("Thread 2: Switch OFF ");

                        try { Thread.sleep(100);} catch (Exception e) {}

                        synchronized (resource1) {
                            System.out.println("Thread 1: Switch OFF");
                        }
                    }
                }
            };


            t1.start();
            t2.start();
        }
    }


