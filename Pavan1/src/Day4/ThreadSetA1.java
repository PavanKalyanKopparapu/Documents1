package Day4;
class MyThread extends Thread
{

    String str;
    public MyThread(String s)
    {
        str=s;
    }
    public void run()
    {
        while(true)
        {
            System.out.println((Thread.currentThread()).getName()+" "+"Message: "+str);

            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie.toString());
            }
        }
    }
}
public class ThreadSetA1
{
    public static void main(String args[])
    {
        MyThread t1= new MyThread("ON");
        MyThread t2= new MyThread("OFF");
        System.out.println("Details of the Threads in running state....");
        t1.start();
        t2.start();
    }
}