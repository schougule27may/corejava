package lock;

public class TestDeadlockExample1 {

    public static void main(String[] args) {
        final String resource1 = "Sherry";
        final String resource2 = "Neha";

        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1 : locked resource 1");
                    try {
                        Thread.sleep(1000);
                        System.out.println("Thread 1 : " +
                                "locked resource 2" + resource2);

                    }catch (Exception e) {

                    }
                }



            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2 : locked resource 2");
                    try {
                        Thread.sleep(100);
                        System.out.println("Thread 2 : " +
                                "locked resource 1" + resource1);
                    }catch (Exception e) {

                    }

                }


            }
        };

        t1.start();
        t2.start();
    }
}
