package abstractexample.abstractkeyword;


abstract class Bike1 {
    Bike1(){
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear() {
        System.out.println("Gear changed parent");
    }
}

class Honda1 extends Bike1 {

    @Override
    void run() {
        System.out.println("Runnig safely");
    }

    @Override
    void changeGear() {
      //  super.changeGear();
        System.out.println("Gear changed child");
    }
}


public class TestAbstractio2 {

    public static void main(String[] args) {
        Bike1 obj = new Honda1();
        obj.run();
        obj.changeGear();
    }
}
