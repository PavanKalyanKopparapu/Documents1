package ExamPractise1;
class EvenThread implements Runnable{
    public void run(){
        for(int i = 0; i<=10;i = i+2){
            System.out.println(" Even Thread value:"+i);
        }
    }
}
  class OddThread implements Runnable{
    public void run(){
        for(int i = 1; i <=10;i =i+2){
            System.out.println("OddThread value:"+i);
        }

    }

}
public class MultiThread3 {
    public static void main(String[] args){
        evenThread et = new evenThread();
        OddThread ot  = new OddThread();
        Thread t1 = new Thread(et);
        Thread t2 = new Thread(ot);
        t1.start();
        t2.start();
        for(int i = 1;i<=10;i++){
            System.out.println("main  Thread value"+i);
        }
    }
}

