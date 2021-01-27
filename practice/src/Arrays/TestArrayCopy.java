package Arrays;

public class TestArrayCopy {

    public static void main(String[] args) {
        char[] copyFrom = {'e', 'a' , 'm' , 'k', 'x' , 'a' , 'z'};
        char[] copyTo = new char[4];
        System.out.println(String.valueOf(copyTo));

        System.arraycopy(copyFrom, 3, copyTo, 0, 4);
        System.out.println(String.valueOf(copyTo));

        int[] copyFromInt = {1,2,3,4,5,6,7};
        int[] copyToInt = new int[4];
        System.out.println("Before copy $$$$$");

        for(int i=0; i<copyToInt.length; i++){
            System.out.println("copyToInt value ==>"+copyToInt[i]);
        }
        System.out.println("After copy $$$$$");
        System.arraycopy(copyFromInt, 3, copyToInt, 0, 4);
        for(int i=0; i<copyToInt.length; i++){
            System.out.println("copyToInt value ==>"+copyToInt[i]);
        }
    }
}
