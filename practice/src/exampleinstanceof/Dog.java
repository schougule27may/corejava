package exampleinstanceof;

class Cat {

}
public class Dog {

    public static void main(String[] args) {
        Dog d = new Dog();
        Object obj = new Object();
        Cat cat = new Cat();
        String str = new String("Test");
        checkInstace(obj);
        checkInstace(d);
        checkInstace(str);
        checkInstace(cat);
    }

    public static void checkInstace(Object obj) {

        if(obj instanceof Dog){
            System.out.println("If the object is of type Dog then only I will print / perform operatioin");
        }
        if(obj instanceof Cat){
            System.out.println("If the object is of type Cat then only I will print / perform operatioin");
        }
    }
}
