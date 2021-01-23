package polymorphism.fianalkeyword;

import exampleinstanceof.Simple1;
import mypack1.Simple;
import polymorphism.overriding.Bike;

public class A {
    static final int data;
    static {
        data=50;
    }


    // 10 methods, 2-4 methods
    public static void main(String[] args) {
        System.out.println(A.data);

        Bike bike = new Bike();
        bike.run();

    }
}
