package abstractexample.abstractkeyword;

abstract class Bike {
   abstract void run();
}

public class Honda extends Bike  {

    @Override
    void run() {
        System.out.println("Honda bike is runnig safely");
    }

    public static void main(String[] args) {
        Bike bike = new Honda();
        bike.run();
    }

}
