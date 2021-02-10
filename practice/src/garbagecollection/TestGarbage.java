package garbagecollection;

import java.util.Date;

public class TestGarbage {


    public void display() {
        System.out.println("Hello world" + new Date());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        TestGarbage s1 = new TestGarbage();
        TestGarbage s2 = new TestGarbage();
        TestGarbage s3 = new TestGarbage();
        s1.display();
        s1 = null;
        System.gc();
        s2.display();
        s2 = null;
        System.gc(); //JVM
        s3.display();
        s3 = null;
        System.gc();

    }
}
