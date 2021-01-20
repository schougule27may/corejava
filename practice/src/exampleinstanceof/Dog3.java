package exampleinstanceof;

import polymorphism.binding.Animal;

class Animal3{

}
public class Dog3 extends Animal3 {

    static void  method(Animal3 a) {

            Dog3 d = (Dog3)a; // downcasting
            System.out.println("Downcast is performed");

    }

    public static void main(String[] args) {
        Animal3 animal3 = new Dog3();
        Dog3 dog3 = new Dog3();
        Dog3.method(animal3);
        Dog3.method(dog3);

    }
}
