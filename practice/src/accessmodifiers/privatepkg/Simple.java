package accessmodifiers.privatepkg;

//Private access modifier
class A {
    private int data = 40;
    private  void msg() {
        System.out.println("Hello");
    }
    private A() {}
}

public class Simple {

    public static void main(String[] args) {
      /*  A a = new A();
        System.out.println("A data==>" + a.data);
        a.msg();*/
    }

}
