package polymorphism.binding;

public class Animal {
    void eat() {
        System.out.println("animal is eating");
    }

    public static void main(String[] args) {
        //Animal a = new Animal();
        Animal a = new Dog2();
        a.eat();
    }
}

class Dog2 extends Animal {

    void eat() {
        System.out.println("Dog is eating");
    }


}
