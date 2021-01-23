package encapsulation;

public class Test {

    public static void main(String[] args) {
        Student s = new Student();
       // s.name = "abc";
        s.setName("Sandeep");
        System.out.println("My name is :" +s.getName());

        StudentReadOnly studentReadOnly = new StudentReadOnly();
      //  studentReadOnly.college ="XYZ";

        System.out.println("My college is :" +studentReadOnly.getCollege());
    }
}
