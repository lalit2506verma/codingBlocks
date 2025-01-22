package Lec12;

import java.util.Scanner;

public class Arrays_Spiral_Print_Clockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }

    public static void printArray(int[][] arr){
        int row_start = 0;
        int col_start = 0;
        int row_end = arr.length-1;
        int col_end = arr[0].length-1;

        int total = arr.length * arr[0].length;
        int count = 0;

        while(count < total){
            for (int i = col_start; i <= col_end && count < total; i++) {
                System.out.print(arr[row_start][i] + ", ");
                count++;
            }
            row_start++;

            for (int i = row_start; i <= row_end && count < total; i++) {
                System.out.print(arr[i][col_end] + ", ");
                count++;
            }
            col_end--;

            for (int i = col_end; i >= col_start && count < total; i--) {
                System.out.print(arr[row_end][i] + ", ");
                count++;
            }
            row_end--;

            for (int i = row_end; i >= row_start && count < total; i--) {
                System.out.print(arr[i][col_start] + ", ");
                count++;
            }
            col_start++;
        }
        System.out.println("END");
    }
}
