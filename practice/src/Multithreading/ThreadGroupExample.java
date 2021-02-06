package Multithreading;

public class ThreadGroupExample implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupExample runnable = new ThreadGroupExample();

        ThreadGroup tg1 = new ThreadGroup("Parent Thread group");

        Thread t1 = new Thread(tg1, runnable, "One");
        t1.start();
        Thread t2 = new Thread(tg1, runnable, "Two");
        t2.start();
        Thread t3 = new Thread(tg1, runnable, "Three");
        t3.start();
        System.out.println("Thread group name" +tg1.getName());
        tg1.list();
    }
}
