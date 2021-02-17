package java8features.methodReference;

interface Sayable {
    void say();
}
public class MethodReference1 {
    public static void saySomething() {
        System.out.println("Hello, this is a static method");
    }
    public static void main(String[] args) {
        Sayable sayable = MethodReference1::saySomething;
        sayable.say();
    }
}
