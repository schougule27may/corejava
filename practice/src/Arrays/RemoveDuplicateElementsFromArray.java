package Arrays;

import java.util.Arrays;

public class RemoveDuplicateElementsFromArray {

    public static void main(String[] args) {
        int arr[] = {9,10,8,9,10,8,5};// unsorted array, // O/p 5,8,9,10
        Arrays.sort(arr); // Sorting the array.
        int length = arr.length;
        length = removeDups(arr, length);
        System.out.println(" Dups removed");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    private static int removeDups(int[] arr, int n) {
        if (n == 0 || n ==1) {
            return n;
        }
       // int arr[] = {9,10,8,9,10,8,5};// unsorted array, // O/p 5,8,9,10
        int[] temp = new int[n];
        int j=0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
}
