package StringExamples;

public class StringImmutableExample2{

    public static void main(String[] args) {
        String s ="Sachin";
        s = s.concat("  Tendulakar") ; // concat() appends the string at the end.
        System.out.println(s);
        String str ="Sachin";
        str =   str.concat("Tend2");
        String str1 ="Sachin";
        System.out.println(str);
        System.out.println(str1);
    }
}
