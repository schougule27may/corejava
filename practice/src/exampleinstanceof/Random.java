package exampleinstanceof;


interface Printable {}
class  A implements Printable{
    public void  a() {
        System.out.println("A method");
    }
}
class  B implements Printable{
    public void  b() {
        System.out.println("B method");
    }
}
class Call {
    void invoke(Printable p){ //Upcasting
        if(p instanceof A) {
            A a =(A) p; //Downcasting
            a.a();
        }
        if(p instanceof B) {
            B b =(B) p ;//Downcasting
            b.b();
        }
    }
}


public class Random {

    public static void main(String[] args) {
        Printable p = new B();
        Call c = new Call();
        c.invoke(p);
    }
}
