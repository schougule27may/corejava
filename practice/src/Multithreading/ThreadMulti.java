package Multithreading;

public class ThreadMulti extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running ....");
    }

    public static void main(String[] args) {
        ThreadMulti thread = new ThreadMulti();
        thread.start();
        for (int i = 0; i < 1000 ; i++) {
            System.out.println("This is a normal loop i");
        }
    }
}
