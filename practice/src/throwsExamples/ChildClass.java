package throwsExamples;


import java.io.IOException;

class ParentClass {
    void msg() {
        System.out.println("I am Parent");
    }
}
public class ChildClass extends ParentClass {
    @Override
    void msg() //throws IOException
    {
        System.out.println(" I am ChildClass");
    }

    public static void main(String[] args) {
        ParentClass p = new ChildClass();
        p.msg();
    }
}
