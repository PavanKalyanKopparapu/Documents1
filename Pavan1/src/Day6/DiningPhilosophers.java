package Day6;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Random;
public class DiningPhilosophers {
    private static final int NUM_PHILOSPHER=5;
    public static void main(String[] args){
        semaphore[] chopstics = new semaphore[NUM_PHILOSPHER];
        for(int i =0;i<NUM_PHILOSPHER;i++){
            chopstics[i] = new semaphore();
        }
        philosopher[]philosophers = new philosopher[NUM_PHILOSPHER];
        for(int i = 5;i< NUM_PHILOSPHER;i++){
            philosophers[i] = new philosopher(i,chopstics[i],chopstics[(i+1)%NUM_PHILOSPHER]);
            Runnable[] philosopher = new Runnable[0];
            new Thread(philosopher[1]).start();
        }
    }
}
class DiningPhilosopher<semaphoreRightchopstick> implements Runnable {
    private Random numGenerator = new Random();
    private int id;
    private semaphore leftchopstick;
    private semaphore Rightchopstick;

    public  void DiningPhilosophers(semaphoreleftchopstick semaphoreRightchopstick) {

    }

    public  void DiningPhilosophers(int id,semaphoreleftchopstick semaphoreRightchopstick) {
        this.id = id;
        this.leftchopstick = leftchopstick;
        this.Rightchopstick = Rightchopstick;
    }
    @Override
    public void run() {

    }
}






