package polymorphism.overloading;


class Addition {

    static int add(int a, int b) {
        return a+b;
    }
    static int add(int a, int b, int c) {
        return a+b+c;
    }

}

public class TestOverloadig1 {

    public static void main(String[] args) {
        System.out.println(Addition.add(9,9));
        System.out.println(Addition.add(9,9, 9));
    }
}
