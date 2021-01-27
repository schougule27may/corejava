package Arrays;

public class MatrixMultiplicationExample {

    public static void main(String[] args) {
        int a[][] = {{1,1,1}, {2,2,2,}, {3,3,3}};
        int b[][] = {{1,1,1}, {2,2,2,}, {3,3,3}};

        int c[][] = new int[3][3]; // 3 rows and 3 columns

        //multiplying and printing

        for (int i=0 ; i<3; i++) { // rows
            for (int j = 0; j < 3; j++) { //columns
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j]+= a[i][k] * b[k][j];
                }// End of the K loop
                System.out.print(c[i][j]+" "); // printing the matrix element
            } // End of J loop
            System.out.println("");
        }
    }
}
