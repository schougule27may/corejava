package exampleinstanceof;

class Simple2 {

}
public class Simple1  extends  Simple2{

    public static void main(String[] args) {
        Simple1 obj = new Simple1();
        System.out.println(obj instanceof Simple1); //true/false ??
        System.out.println(obj instanceof Simple2); //true/false ??
    }
}
