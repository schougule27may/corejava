package collection.ListInterface;

import ObjectExmples.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericNonGeneric {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Sandeep");
        list.add(1);
        list.add(null);
        list.add(1.0f);

        ArrayList<String> list2 = new ArrayList();
        list2.add("Sandeep");
        list2.add("Sherry");

        for(String str: list2) {
            System.out.println(str);
        }

        ArrayList<Student> list3 = new ArrayList();
        list3.add(new Student(45, "Sandeep"));
        list3.add(new Student(50, "Sherry"));


        for(Student student: list3) {
            System.out.println(student);
        }


    }
}
