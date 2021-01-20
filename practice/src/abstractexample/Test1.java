package abstractexample;


abstract class Shape{
   abstract void draw();
}

class Rectangle extends Shape{
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape{
    void draw() {
        System.out.println("drawing Circle");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Shape s = new Circle(); // in a real scenario, object is provided through method eg. getShape method
        s.draw();
    }

}
