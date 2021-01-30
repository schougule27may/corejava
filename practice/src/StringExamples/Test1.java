package StringExamples;

public class Test1 {

    public static void main(String[] args) {
        String s1 = "java"; // creating by literal
        char ch[] = {'j','a','v','a'};

        String s2 = new String(s1);
        String s3 = new String("examaple");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
