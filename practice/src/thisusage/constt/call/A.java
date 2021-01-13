package thisusage.constt.call;

public class A {

     String data = "100";

    A () {
        B b = new B(this);
        b.display();
    }


    public static void main(String[] args) {
        A a = new A();
    }
}
