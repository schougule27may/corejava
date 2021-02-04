package Multithreading;

import java.util.Date;

public class ThreadSleep extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                if(i == 3) {
                    System.out.println("Sleep Started" + new Date());
                    Thread.sleep(2000);
                    System.out.println(i);
                    System.out.println("Sleep Ended" + new Date());

                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();
        t1.start();
        //t2.start();


    }
}
