package polymorphism.overloading;


class Addition3 {

    static int add(int a, int b) {
        return a+b;
    }
   /* static double add(int a, int b) {
        return a+b;
    }*/

}

public class TestOverloadigReturn3 {

    public static void main(String[] args) {
        System.out.println(Addition3.add(9,9));
        System.out.println(Addition3.add(9,9));
    }
}
