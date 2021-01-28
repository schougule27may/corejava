package Arrays;

public class OddAndEvenFromArray {

    public static void main(String[] args) {
        int a[] = {1,2,4,3,7,9}; //odd 1,3,7,9 even 2,4
        Object object  = null;

        System.out.println("Odd numbers");
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 !=0){
                System.out.println("Odd number is " + a[i]);
            }
        }
        System.out.println("====== Even numbers ====== ");
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 ==0){
                System.out.println("Even number is " + a[i]);
            }
        }
    }
}
