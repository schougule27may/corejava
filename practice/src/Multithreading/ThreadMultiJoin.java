package Multithreading;

public class ThreadMultiJoin extends Thread {

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
        ThreadMultiJoin thread1 = new ThreadMultiJoin();
        ThreadMultiJoin thread2 = new ThreadMultiJoin();
        ThreadMultiJoin thread3 = new ThreadMultiJoin();
        thread1.start();
        try {
            thread1.join();
        }catch (Exception e) {
            System.out.println(e);
        }
       thread2.start();
       thread3.start();
    }

}
