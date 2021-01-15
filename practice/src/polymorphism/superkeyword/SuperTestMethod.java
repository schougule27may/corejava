package polymorphism.superkeyword;

class Animal1 {
    void eat() {
        System.out.println("eating .....");
    }
}

class  Dog1 extends Animal1 {
    void eat () {
        System.out.println("eating bread.....");
    }
    void bark () {
        System.out.println("barking.....");
    }
    void work() {
        super.eat();
        bark();
    }
}

public class SuperTestMethod {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.work();
    }
}
