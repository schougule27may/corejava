package Arrays;

public class AdditionTwoMatrices {


    public static void main(String[] args) {
        int a[][] = {{1,3,4},{3,4,5}};
        int b[][] = {{1,3,4},{3,4,5}};

        //creating another matix to store the sum of two matrices
        int c[][] = new int[2][3];
        for (int i = 0; i < 2 ; i++) { //rows
            for (int j = 0; j < 3; j++) { //columns
                c[i][j] = a[i][j] + b[i] [j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
