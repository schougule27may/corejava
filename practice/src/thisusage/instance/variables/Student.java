package thisusage.instance.variables;

public class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        rollNo = rollNo;
        name = name;
    }
    void display() {
        System.out.println("rollNo: -"+rollNo + " ::"  + "name :-" +name);
    }

    public static void main(String[] args) {
        Student student1 = new Student(45,"Sandeep");
        Student student2 = new Student(01,"Imran");
        student1.display();
        student2.display();
    }
}
