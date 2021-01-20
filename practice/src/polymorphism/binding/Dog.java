package polymorphism.binding;

public class Dog {
    static void eat() {
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
    }
}
