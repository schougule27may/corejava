package polymorphism.overloading;


class Addition2 {

    static int add(int a, int b) {
        return a+b;
    }
    static double add(double a, double b) {
        return a+b;
    }

}

public class TestOverloadig2 {

    public static void main(String[] args) {
        System.out.println(Addition2.add(9,9));
        System.out.println(Addition2.add(9.5,9.5));
    }
}
