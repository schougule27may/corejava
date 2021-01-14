package polymorphism.overriding;

class Vehicle {
    void run(){
        System.out.println("Vehicle is running");
    }
}

public class Bike extends Vehicle {
    void run(){
        System.out.println("Bike is running");
    }
    public static void main(String[] args) {
    /*    Bike obj = new Bike();
        obj.run();*/

        Vehicle vehicle = new Vehicle();
        vehicle.run();
    }
}


