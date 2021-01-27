package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestInArrayExample {

    public static void main(String[] args) {
        int a[] = {1,2,3,5,7,4,0}; // 7,5,4,3
        int b[] = {44,66,99,77,33,22,55}; // 99, 77, 66, 55, 44

        Integer a1[] = {1,2,3,5,7,4,0}; // 7,5,4,3
        Integer b2[] = {44,66,99,77,33,22,55}; // 99, 77, 66, 55, 44

        System.out.println("Third largest number is : "+ getLargestByParam(a,7, 3));
        System.out.println("Third largest number is : "+ getLargestByParam(b,7,3));
        System.out.println("Third largest number is : "+ getThirdLargestNumber(a,7));
        System.out.println("Third largest number is : "+ getThirdLargestNumber(b,7));
        System.out.println("Third largest number is : "+ getThirdLargestNumberByCollection(a1,7));
        System.out.println("Third largest number is : "+ getThirdLargestNumberByCollection(b2,7));
    }

    private static int getLargestByParam(int[] a, int total, int whichLargest) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i+1; j < total ; j++) {
                if(a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        return a[total-whichLargest];
    }

    private static int getThirdLargestNumber(int[] a, int total) {
        Arrays.sort(a);
        return a[total-3];
    }
    private static int getThirdLargestNumberByCollection(Integer[] a, int total) {
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(total-3);
        return element;
    }
}
