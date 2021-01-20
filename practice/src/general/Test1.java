package general;

public class Test1 {

    public static void main(String[] args) {


        System.out.println(Integer.valueOf("100"));
       // System.out.println(Integer.valueOf("35.6"));

        //In mathematical numeral systems, the radix specifies the number of unique digitals
        // in the numeral system including 0.
        // For example, a radix of 10 would represent the Decimal system
        // because the Decimal system uses ten digits from 0 through 9. Whereas,
        // a radix of 2 would represent the Binary system because the Binary system uses
        // only two digits which are 0 and 1.
        System.out.println(Integer.valueOf("1111", 2));
        System.out.println(Integer.valueOf("111", 2));
        System.out.println(Integer.valueOf("1", 2));
        System.out.println(Integer.valueOf("100", 2));
        System.out.println(Integer.valueOf("-100", 2));
        System.out.println(Integer.valueOf("-123"));
        System.out.println("Parse Int begin");

        System.out.println(Integer.parseInt("111", 2));
        System.out.println(Integer.parseInt("111", 2));
        System.out.println(Integer.parseInt("1", 2));
        System.out.println(Integer.parseInt("100", 2));
        System.out.println(Integer.parseInt("-100", 2));
        System.out.println(Integer.parseInt("-123"));


    }
}
