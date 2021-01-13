package thisusage.instance.variables;

public class StudentWithNotThis {
    int rollNo;
    String name;

    //constructor
    StudentWithNotThis(int rNo, String sName) {
        rollNo = rNo;
        name = sName;
    }
    //method
    void display() {
        System.out.println("rollNo: -"+rollNo + " ::"  + "name :-" +name);
    }


    //Start Run / Entry point
    public static void main(String[] args) {
        StudentWithNotThis student1 = new StudentWithNotThis(45,"Sandeep");
        StudentWithNotThis student2 = new StudentWithNotThis(01,"Imran");
        student1.display();
        student2.display();
    }
}
