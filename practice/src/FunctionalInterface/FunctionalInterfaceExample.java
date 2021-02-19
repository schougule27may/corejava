package FunctionalInterface;

@FunctionalInterface
interface sayable {
    void say(String msg); //abstract method
    int hashCode();
    String toString();
    boolean equals(Object obj);

}

public class FunctionalInterfaceExample implements sayable {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello world");
    }
}
