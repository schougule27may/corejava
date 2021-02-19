package FunctionalInterface;

interface Doable2 {
    default void doIt() {
        System.out.println("Do it now");
    }
}

@FunctionalInterface
interface Sayable2 extends Doable2 {
    void say(String msg); // abstract method
}

public class FuncInterfaceExample2 implements Sayable2 {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FuncInterfaceExample2 obj = new FuncInterfaceExample2();
        obj.say("Hello world");
        obj.doIt();
    }
}
