package polymorphism.superkeyword;

class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println("color===>" + color);
        System.out.println("Super color==>"+ super.color);
    }

}


public class SuperTest1 {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
