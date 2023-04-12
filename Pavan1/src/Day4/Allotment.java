package Day4;

class collegeThread implements Runnable {
    int seats;

    collegeThread(int seats) {
        this.seats = seats;
    }

    public void run() {
        Thread ct = Thread.currentThread();
        String tname = ct.getName();
        System.out.println(tname + "No of seats avaible before allotment:" + seats);
        if (seats > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
            }
            System.out.println("Seat is Alooted to " + tname);
            seats = seats - 1;
        } else {
            System.out.println("seat is not alloted to" + tname);
        }
        System.out.println(tname + "No of seats available after allotment:" + seats);
    }
}
 class Allotment {
     public static void main(String[] args) {
         collegeThread ct = new collegeThread(1);
         Thread t1 = new Thread(ct);
         Thread t2 = new Thread(ct);
         Thread t3 = new Thread(ct);
         t1.setName("Sammer");
         t2.setName("Adithya");
         t3.setName("Pavan");
         t1.start();
         t2.start();
         t3.start();
     }


 }
