package Streams;

import java.util.stream.Stream;

public class JavaStreamExample3 {

    public static void main(String[] args) {
        Stream.iterate(1, element -> element+1)
        .filter(element -> element % 2 == 0)
        .limit(3)
        .forEach(System.out::println);
        ;
        //1,2,3,4,5 == 5
        //1,2,3,4,5, 6,7,8,9,10,11 == 5, 10
    }
}
