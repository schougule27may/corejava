package java8features.lambdaExamples;
interface Addable {
    int add(int a, int b);
}

public class LambdaExample3 {
    public static void main(String[] args) {
        Addable add1 = (a,b) -> (a+b);
        System.out.println(add1.add(10,30));
        Addable  add2 = (int a, int b)-> (a+b);
        System.out.println(add2.add(1,1));
    }

}
