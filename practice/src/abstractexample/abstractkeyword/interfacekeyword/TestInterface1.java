package abstractexample.abstractkeyword.interfacekeyword;


interface Drawable {
    void draw();
}

class Rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class TestInterface1 {

    public static void main(String[] args) {
        Drawable d = new Circle(); //In real scenario, object is provided by method e.g. getDrawble();
        d.draw();
    }
}
