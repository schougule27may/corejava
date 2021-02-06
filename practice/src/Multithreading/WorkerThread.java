package Multithreading;

import java.util.Date;

public class WorkerThread implements Runnable {

    private String message;
    public WorkerThread(String s) {
        this.message=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = " +message + "Start Date Time " + new Date());

        //sleeps the thread for 2 seconds
        processMessage();
        System.out.println(Thread.currentThread().getName()+" (End)"   + new Date());

    }

    private void processMessage() {
        try {
            Thread.sleep(200); //2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
