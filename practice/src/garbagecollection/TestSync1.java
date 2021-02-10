package garbagecollection;

class Table1{

     void printTable(int n) {
         System.out.println("Started printTable");
         // pre preation
         // ===
         synchronized(this){ // block  synchronized
             for (int j = 1; j <= 5 ; j++) {
                 System.out.println(n*j);
                 try {
                     Thread.sleep(400);
                 }catch (Exception e) {
                     System.out.println(e);
                 }
                 j=2;
             }
             System.out.println("Completed printTable");
         }


    }
}
public class TestSync1 {

    public static void main(String[] args) {
        final Table1 obj = new Table1();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                obj.printTable(5);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                obj.printTable(100);
            }
        };
        t1.start();
        t2.start();
    }
}
