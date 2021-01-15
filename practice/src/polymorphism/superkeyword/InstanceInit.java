package polymorphism.superkeyword;

class Bike {
    int maxSpeed;

    Bike() {
        System.out.println("Max Speed is"+ maxSpeed);
    }
    //Initilizer
    {maxSpeed = 100;}
}

public class InstanceInit {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        Bike bike2 = new Bike();
    }
}
