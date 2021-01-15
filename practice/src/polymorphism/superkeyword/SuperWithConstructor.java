package polymorphism.superkeyword;

class Animal3 {
    Animal3() {
        System.out.println("Animal is created");
    }
    Animal3(String color) {
        System.out.println("Animal is created with color :-" +color);
    }
}

class Dog3 extends Animal3 {
    Dog3() {
        super("White");
        System.out.println("Dog is created");
    }

}

public class SuperWithConstructor {
    public static void main(String[] args) {
        Dog3 dog3  = new Dog3();

    }
}
