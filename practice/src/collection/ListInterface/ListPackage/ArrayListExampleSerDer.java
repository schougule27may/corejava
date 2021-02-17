package collection.ListInterface.ListPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListExampleSerDer {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Mobin");
        al.add("Iram");
        al.add("Ali");
        try {
            //Serialization
            FileOutputStream fos = new FileOutputStream("myFirstBatchStudents");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();

            //Deserializaton
            FileInputStream fis = new FileInputStream("myFirstBatchStudents");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList list = (ArrayList) ois.readObject();

            System.out.println(list);


        }catch (Exception e){

        }
    }
}
