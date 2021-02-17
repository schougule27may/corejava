package collection.ListInterface.ListPackage;

import ObjectExmples.Student;

import java.util.ArrayList;
import java.util.Collections;

public class getSetArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        al.remove("Banana");
      //
      //  al.removeAll(al);
        System.out.println("Returning elem first ==>"  + al.get(0)); //
        al.set(0,"Dates");
        al.remove(0);

        Collections.sort(al);

        System.out.println("Returning elem first ==>"  + al.size());
        for (String fruit:al){
            System.out.println(fruit);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(6);
        numbers.add(1);
        numbers.remove(0);
        Collections.sort(numbers);
        for (Integer num:numbers){
            System.out.println(num);
        }

        Student s1 = new Student(45, "Sandeep");
        Student s2 = new Student(50, "Sherry");
        Student s3 = new Student(01, "Neha");

        ArrayList<Student> students1 = new ArrayList<Student>();
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);
        for (Student st:students1){
            System.out.println(st);
        }

        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(s1);
        students2.add(s2);
        students2.add(s3);


        ArrayList<Student> finalStudents = new ArrayList<>();
        finalStudents.addAll(students1);
        finalStudents.addAll(students2);


    }
}
