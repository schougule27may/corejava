package Multithreading;

public class ThreadExample1  extends Thread{
    @Override
    public void run() {
        System.out.println();
        if(Thread.currentThread().getName().equalsIgnoreCase("Sandeep")) {
            System.out.println("Special operation");
        } else {
            System.out.println("Normal flow");
        }
    }

    public static void main(String[] args) {
        ThreadExample1 t1 = new ThreadExample1();
        ThreadExample1 t2 = new  ThreadExample1();
        ThreadExample1 t3 = new  ThreadExample1();
        System.out.println("Name of t1" + t1.getName());
        System.out.println("Name of t2" + t2.getName());
        System.out.println("Name of t2" + t1.getId());
        t1.setName("Sandeep");
        t1.start();
        t2.start();
        t3.start();

        System.out.println("After changing Name of t1 ==> " + t1.getName());
    }
}
