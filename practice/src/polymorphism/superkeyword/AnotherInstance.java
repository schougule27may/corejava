package polymorphism.superkeyword;

class A {
    A() {
        System.out.println("Parent class constructor invoked");

    }
}
class B extends A{

    B() {
        super();
        System.out.println("child class constructor invoked");
    }
    B(int a) {
        super();
        System.out.println("child class constructor invoked a:-" +a);
    }
    {
        System.out.println("Instance initilizer block is invoked");

    }
}



public class AnotherInstance {
    public static void main(String[] args) {
        //B b1= new B();
        B b2= new B(2);
    }
}
