package polymorphism.binding;



class Boy extends Human {
    public void walk() {
        System.out.println("Boy is walking");
    }
}

class Girl extends Human {
    public void walk() {
        System.out.println("Girl is walking");
    }
}
public class Human {

    public void walk() {
        System.out.println("Human walk");
    }

    public static void main(String[] args) {
        Human obj =  new Human();
        obj.walk();

        obj =  new Boy();
        obj.walk();

        obj =  new Girl();
        obj.walk();
    }
}
