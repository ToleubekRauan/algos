package concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        Thread[] threads = new Thread[100];
        for (int i = 1; i <= 100; i++) {
            Thread thr = new Thread(thread, "t" + i);
            threads[i - 1] = thr;
            thr.start();
        }

        for (Thread thread1 : threads) {
            thread1.join();
        }

        System.out.println("total " + thread.getCount());
    }

    static class MyThread extends Thread {

        //private AtomicInteger count = new AtomicInteger();
        private int count;

        public int getCount() {
            return count;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(0);
                    count++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
