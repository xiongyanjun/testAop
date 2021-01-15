package threadPool;

import java.util.concurrent.TimeUnit;

/**
 * Created by j_zhan on 2016/7/6.
 */
public class WaitNotify {
    static boolean flag = true;
    static Object lock = new Object();
    static Integer num = 0;

    public static void main(String[] args) throws InterruptedException {
//        Thread A = new Thread(new Wait(), "wait thread");
//        A.start();
//        TimeUnit.SECONDS.sleep(2);
//        Thread B = new Thread(new Notify(), "notify thread");
//        B.start();
        new Thread(new PlusNum("A")).start();
        new Thread(new PlusNum("B")).start();

    }

    static class PlusNum implements Runnable{
        private String threadName;

        public PlusNum(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                synchronized (num) {
                    num++;
                    System.out.println(threadName + ":" + num);
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Wait implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                while (flag) {
                    try {
                        System.out.println(Thread.currentThread() + " flag is true");
                        lock.wait();
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println(Thread.currentThread() + " flag is false");
            }
        }
    }

    static class Notify implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                flag = false;
                lock.notifyAll();
                System.out.println("notify");
                try {
                    TimeUnit.SECONDS.sleep(7);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

