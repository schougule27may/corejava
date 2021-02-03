package InnnerClassExamples;

public class TestMember {

    private int data=30;

    class Inner {
        void msg() {
            System.out.println("Data is ==> " + data);
        }
    }

    public static void main(String[] args) {
        TestMember t1 = new TestMember();
        TestMember.Inner t2 =t1.new Inner();
        t2.msg();

    }
}
