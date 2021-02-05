package Multithreading;

public class ThreadMulti2 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running ....");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMulti2 thread1 = new ThreadMulti2();
        ThreadMulti2 thread2 = new ThreadMulti2();
        thread1.run();
        Thread.sleep(2000);
        thread2.start();
    }

}
