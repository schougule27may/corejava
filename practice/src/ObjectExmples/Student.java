package ObjectExmples;

import java.util.Objects;

public class Student implements Cloneable {
    int rollNo;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public  Object clone() throws  CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
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
