package polymorphism.fianalkeyword;

public class Bike {
    int speedlimit = 90; // final variable
    // final int speedlimit = 90; // final variable

    void run() {
        speedlimit = 400;
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();

    }
}
