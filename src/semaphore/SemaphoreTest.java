package semaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {


    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(10);

        for (int i = 1; i < 100; i++) {
            new Philosopher(semaphore, i).start();
        }
    }
}

class Philosopher extends Thread {

    private final Semaphore semaphore;
    private final int id;

    Philosopher(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }


    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Философ " + id + " садится за стол");
            sleep((long) (new Random().nextFloat() * 5000));
            System.out.println("Философ " + id + " выходит со стола");
            semaphore.release();
            sleep((long) (new Random().nextFloat() * 5000));
        }catch (InterruptedException e) {
            System.out.println ("у философа " + id + " проблемы со здоровьем");
        }
    }
}

