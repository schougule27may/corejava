package Arrays;

public class ArrayAnonymousTest {

    public static void main(String[] args) {
        printArray(new int[]{10,1,12,3}); // passing anonymous array to method
    }

    private static void printArray(int[] arrayName) {
        for(int i =0 ; i< arrayName.length; i++) {
                System.out.println("value at position " + i  + " is ==>" +arrayName[i]);
        }
    }
}
