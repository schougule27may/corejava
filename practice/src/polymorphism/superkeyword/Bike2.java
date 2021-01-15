package polymorphism.superkeyword;

class Vehicle {

    Vehicle() {
        System.out.println("I am vehicle");
    }
}
public class Bike2 extends Vehicle {
    int speed;


    //Constructor
    Bike2(){
        //1
        System.out.println("Constructor is invoked 3");
    }
    //Initilizer 2
    {
        //2
        System.out.println("instance initilizer block invoked 2");
    }
    //Initilizer 1
    {
        //2
        System.out.println("instance initilizer block invoked 1");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Bike2();

    }
}
