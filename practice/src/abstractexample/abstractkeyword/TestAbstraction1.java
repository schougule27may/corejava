package abstractexample.abstractkeyword;


abstract class Shape {
    abstract void draw();
}
//In real scenario, implementation is provided by others. ie. unknown by end user.

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle");
    }
}
class Circle extends Shape  {
    void draw() {
        System.out.println("Drawing Circle");
    }
}


//In real scenario, method is called by programmer or user

public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s = new Circle(); // Object is provided throught method getShape method
        s.draw();
    }

}
