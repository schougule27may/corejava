package polymorphism.overloading;

public class TestOverloading4 {
    public static void main(String[] args) {
        System.out.println("main with String[] args");
    }

    public static void main(String args) {
        System.out.println("main with String args");
    }

    public static void main() {
        System.out.println("main without args");
    }
}
