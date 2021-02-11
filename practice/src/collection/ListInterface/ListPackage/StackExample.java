package collection.ListInterface.ListPackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> al = new Stack<String>();
        al.push("xyz");
        al.push("abc");
        al.push("test");
        al.push("sandeep");
        al.pop(); //removing
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
