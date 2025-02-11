package Lec12;

import java.util.Scanner;

public class Boolean_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        zeroMatrix(matrix);
        
        //print
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void zeroMatrix(int[][] matrix){
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns

        // int[] markedRow = new int[m]  -> matrix[m][...]
        // int[] markedCol = new int[n]  -> matrix[...][n]

        int col0 = 0;

        // marking the marked Row and column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if(matrix[i][j] == 1){
                    // marking ith row
                    matrix[i][0] = 1;
                    //marking jth col
                    if(j != 0){
                        matrix[0][j] = 1;
                    }
                    else{
                        col0 = 1;
                    }
                }
            }
        }

        // transversing fromm the right bottom corner except marked row and column
        for (int i = m-1; i > 0 ; i--) {
            for (int j = n-1; j > 0 ; j--) {
                if(matrix[i][0] == 1 || matrix[0][j] == 1){
                    matrix[i][j] = 1;
                }
            }
        }

        // for marked row
        for (int i = n-1; i > 0 ; i--) {
            if(matrix[0][0] == 1){
                matrix[0][i] = 1;
            }
        }

        // for marked column
        for (int j = m-1; j > 0; j--) {
            if(col0 == 1){
                matrix[j][0] = 1;
            }
        }
    }
}
