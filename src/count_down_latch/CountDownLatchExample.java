package count_down_latch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {


    static class WorkingThread extends Thread {

        private final CountDownLatch countDownLatch;

        WorkingThread(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep((long) (new Random().nextFloat() * 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("count = " + countDownLatch.getCount() + ", " + Thread.currentThread().getName());
            countDownLatch.countDown();

            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Name = " + Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        new WorkingThread(countDownLatch).start();
        new WorkingThread(countDownLatch).start();
        new WorkingThread(countDownLatch).start();
        new WorkingThread(countDownLatch).start();
        new WorkingThread(countDownLatch).start();
    }
}
