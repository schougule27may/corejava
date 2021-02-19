package FunctionalInterface;

interface sayable2 {
    void say(String msg); //abstact method
}

//@FunctionalInterface
//Invalid @FunctionalInterface, Doable is not a functional interface
public interface Doable extends sayable {
    void doIt();
}
