package java8features.methodReference;

import java.util.function.BiFunction;

class Arith {
    public int add(int a, int b) {
        return a+b;
    }
}

public class IntanceeMethodRef3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer , Integer> adder =  new Arith()::add;
        int result = adder.apply(10,20);
        System.out.println(result);
    }

}
