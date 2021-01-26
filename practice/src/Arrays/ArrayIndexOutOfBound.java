package Arrays;

public class ArrayIndexOutOfBound {

    public static void main(String[] args) {
        int arr[] = {1,2,4,10};
        for(int i=2; i< arr.length; ){
            System.out.println("A ==>" +arr[i]);
          //  i =i+2;
            i++;
        }
    }
}
