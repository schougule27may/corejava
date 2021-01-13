package thisusage.currentclass;

public class A {
    void n(){
        System.out.println("Hello n");

    };
    void m() {
        System.out.println("Hello m");
        this.n();
    }

    public static void main(String[] args) {
       A a =  new A();
       a.m();

    }
}
