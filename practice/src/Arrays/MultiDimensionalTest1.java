package Arrays;

public class MultiDimensionalTest1 {

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{2,4,5},{4,4,5}}; // 2D Array
        for(int i=0 ; i <3; i++){
            for(int j=0 ; j <3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
