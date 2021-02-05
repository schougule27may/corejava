package Multithreading;

public class ThreadExample3 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread name is:" + Thread.currentThread().getName());
        System.out.println("Thread priority is:" + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadExample3 t1 = new ThreadExample3();
        ThreadExample3 t2 = new ThreadExample3();
        t1.setName("Test 1");
        t2.setName("Test 2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
