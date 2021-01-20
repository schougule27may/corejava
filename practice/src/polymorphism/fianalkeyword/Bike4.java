package polymorphism.fianalkeyword;

 class Vehical {
     final void run() {
         System.out.println("running .....");
     }
 }

public class Bike4 extends Vehical {

     /*void run(){

     }*/

    public static void main(String[] args) {
        new Bike4().run();
    }
}


