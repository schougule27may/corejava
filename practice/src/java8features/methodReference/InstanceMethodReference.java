package java8features.methodReference;

interface Sayable3 {
    void say();
}
public class InstanceMethodReference {
    public void saySomething() {
        System.out.println("Hello, this is a non-static method.");
    }

    public static void main(String[] args) {
        //Creating a object
        InstanceMethodReference methodReference = new InstanceMethodReference();
        //Refering a non-static method using referece
        Sayable3 sayable1 = methodReference::saySomething;
        sayable1.say();

        Sayable3 sayable2 = new InstanceMethodReference()::saySomething;
        //anonymous object
        sayable2.say();


    }
}
