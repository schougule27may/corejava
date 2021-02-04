package Multithreading;

public class ThreadInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        ThreadInterface t1 = new ThreadInterface();
        Thread t2 = new Thread(t1);
        t2.start();
    }
 // I

}
