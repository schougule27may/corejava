package Multithreading;

public class TestShutdown1 {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MyThread());
        System.out.println("Now main sleeping ... press ctr+C to exit");
        try {
            Thread.sleep(20000);
        }catch (Exception e){

        }
        System.out.println("Completted");
    }
}
