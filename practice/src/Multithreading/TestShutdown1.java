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

       // === code
        // === code

        // === code
        // === code
        // x=== code// === code
        // === code
        //y === code
        // === code
        // === code
        // === code// === code

        // z=== code
        // === code



        System.out.println("Completted");
    }
}
