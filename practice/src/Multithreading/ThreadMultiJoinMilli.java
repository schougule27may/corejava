package Multithreading;

public class ThreadMultiJoinMilli extends Thread {

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
        ThreadMultiJoinMilli thread1 = new ThreadMultiJoinMilli();
        ThreadMultiJoinMilli thread2 = new ThreadMultiJoinMilli();
        ThreadMultiJoinMilli thread3 = new ThreadMultiJoinMilli();
        thread1.start();
        try {
            thread1.join(1000);
        }catch (Exception e) {
            System.out.println(e);
        }
       thread2.start();
       thread3.start();
    }

}
