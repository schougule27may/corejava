package Multithreading;

public class ThreadDaemon extends Thread {

    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()) { //checked
            System.out.println("Daemon thread work");
        } else {
            System.out.println("User thread work");
        }
    }

    public static void main(String[] args) {
        ThreadDaemon t1 = new ThreadDaemon();
        ThreadDaemon t2 = new ThreadDaemon();
        ThreadDaemon t3 = new ThreadDaemon();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
