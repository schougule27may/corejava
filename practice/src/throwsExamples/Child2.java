package throwsExamples;


class Parent2 {
    void msg() {
        System.out.println("parent");
    }
}

public class Child2 extends Parent2{
    void msg() throws ArithmeticException {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent2 p = new Parent2();
        p.msg();
    }
}
