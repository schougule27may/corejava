package thisusage.instance.variables;

public class StudentWithThis {
    int rollNo;
    String name;

    StudentWithThis(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    void display() {
        System.out.println("rollNo: -"+rollNo + " ::"  + "name :-" +name);
    }

    public static void main(String[] args) {
        StudentWithThis student1 = new StudentWithThis(45,"Sandeep");
        StudentWithThis student2 = new StudentWithThis(01,"Imran");
        student1.display();
        student2.display();
    }
}
