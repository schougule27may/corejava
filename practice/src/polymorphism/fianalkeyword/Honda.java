package polymorphism.fianalkeyword;

class Bike2 {


 //for testing
   void run() {
        System.out.println("Running");
    }



    /*
    When you run it locally un comment below to see compile time error.

    */
    /*
    final void run() {
        System.out.println("Running");
    }*/


}


public class Honda extends Bike2 {

    void run(){
        System.out.println("running safely 100kmph");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }

}
