package Arrays;

public class TestCloneArray {

    public static void main(String[] args) {
        int arr[] = {33,3,4,5};
        System.out.println("Printing original array:");
        printArray(arr);

        System.out.println("Printing clone of the array:");
        int carr[] = arr.clone();
        printArray(carr);
        System.out.println("Are both equal : ??");
        int notClone[] = arr;
        System.out.println(arr == carr);
        System.out.println(arr == notClone);

        carr[0] = 445;

        System.out.println("Printing clone of the array:");
        printArray(carr);
        System.out.println("Printing original array:");
        printArray(arr);
        notClone[0] = 99;
        System.out.println("Printing not cloned of the array:");
        printArray(notClone);
        System.out.println("Printing original array:");
        printArray(arr);

    }

    private static void printArray(int[] carr) {
        for (int i : carr) {
            System.out.println(i);
        }
    }

}
