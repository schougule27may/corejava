package ObjectExmples;

public class Student implements Cloneable {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public  Object clone() throws  CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student s1 = new Student(45, "Sandeep");
            s1.name="San1";
            Student s2 = (Student)s1.clone();
           // Student s2 = s1;
            s2.name="San2";
            System.out.println("S1===" + s1.rollNo  +" name" + s1.name);
            System.out.println("S2===" + s2.rollNo  +" name" + s2.name);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
