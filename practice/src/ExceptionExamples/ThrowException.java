package ExceptionExamples;

public class ThrowException {
//Problem without exception handling
    public static void main(String[] args) {
        int data= 100/0; // may throw exception
        System.out.println("Rest of the code");
    }
}
