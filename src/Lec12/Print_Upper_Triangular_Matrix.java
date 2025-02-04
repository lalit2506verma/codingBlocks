package Lec12;

import java.util.Scanner;

public class Print_Upper_Triangular_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printUpper(arr);
    }

    public static void printUpper(int[][] arr){

        int n = arr.length; // rows
        int m = arr[0].length; // column

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i > j){
                    System.out.print("0 ");
                }
                else{
                    System.out.print(arr[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}
