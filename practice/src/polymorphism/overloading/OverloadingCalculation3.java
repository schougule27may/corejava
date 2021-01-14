package polymorphism.overloading;

public class OverloadingCalculation3 {

    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("a method invoked");
    }

    public static void main(String[] args) {
        OverloadingCalculation3 overloadingCalculation3 = new OverloadingCalculation3();
       // overloadingCalculation3.sum(20,20);//
    }
}
