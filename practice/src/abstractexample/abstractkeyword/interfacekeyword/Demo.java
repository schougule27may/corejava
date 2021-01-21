package abstractexample.abstractkeyword.interfacekeyword;

interface Test {
    void add();
}
interface Test2 {
    void add();
}


public class Demo implements Test, Test2 {

    @Override
    public void add() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.add();
    }
}
