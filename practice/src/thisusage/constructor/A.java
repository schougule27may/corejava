package thisusage.constructor;

public class A {
    A() {
        this(100);
        System.out.println("hello a");
    }
    A(int x) {
        // this();
        System.out.println("hello x :-> "  +x);
    }

    public static void main(String[] args) {
        new A();
    }
}
