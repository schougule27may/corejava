package polymorphism.overloading;

public class OveloadingCalculation2 {

    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }
    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }

    public static void main(String[] args) {
        OveloadingCalculation2 obj =  new OveloadingCalculation2();
        obj.sum(20, 20l);
    }
}
