package java8features.methodReference;

public class IntanceMethodRef2 {

    public void printMsg() {
        System.out.println("Hello, this is instance method message");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(new IntanceMethodRef2()::printMsg);
        t2.start();
    }
}
