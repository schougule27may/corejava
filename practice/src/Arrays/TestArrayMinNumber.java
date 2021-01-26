package Arrays;

public class TestArrayMinNumber {

    public static void main(String[] args) {
        int a[] = {1,3,310};
        int b[] = {110, 24,33};
        int c[] = {3,310, 42,5};

     //   min(a);
        min(b);
       // min(c);
    }

    //min number from array
    private static void min(int[] a) {
        int min = a[0];
        for(int i=1; i<a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println("Min" + min);

    }
}
