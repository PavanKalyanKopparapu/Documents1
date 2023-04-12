package Day4;
 class EvenThread implements Runnable {

     @Override
     public void run() {
         for (int i = 0; i <= 20; i = i + 2) {
             System.out.print("Even Thread value:" + i);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException ie) {
             }
         }
     }

     static class OddThread implements Runnable {
          public void run() {
              for (int i = 1; i <= 20; i = i + 2) {
                  System.out.println("Odd Thread value:" + i);
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException ie) {

                  }
              }

          }

          class MultiThreading2 {
              public static void main(String[] args) throws InterruptedException {
                  EvenThread et = new EvenThread();
                  OddThread ot = new OddThread();
                  Thread t1 = new Thread(et);
                  Thread t2 = new Thread(ot);
                  t1.start();
                  t2.start();
                  for (int i = 1; i <= 10; i++) {
                      System.out.println("main Thread value:" + i);
                      Thread.sleep(1000);
                  }
              }
          }
      }}




