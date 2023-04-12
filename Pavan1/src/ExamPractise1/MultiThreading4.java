package ExamPractise1;
class evenThread implements Runnable {

    @Override
    public void run() {
        {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Even Thread value:" + i);

            }
        }


        class OddThread implements Runnable {
            public void run() {
                int i;
                for (i = 0; i <= 10; i++) ;
                System.out.println("Odd Thread value:" + i);


            }
        }

        class MultiThreading4 {
            public void main(String[] args) {
                evenThread et = new evenThread();
                OddThread ot = new OddThread();
                Thread t1 = new Thread(et);
                Thread t2 = new Thread(ot);
                t1.start();
                t2.start();
                for (int i = 0; i < 10; i++) {
                    System.out.println("main Thread value" + i);

                }
            }
        }
    }
}





