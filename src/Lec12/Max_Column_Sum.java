package Lec12;

import java.util.Scanner;

public class Max_Column_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int col = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int max = columnSum(arr, i);
            if(max > maxSum){
                maxSum = max;
                col = i;
            }
        }

        System.out.print(col+1 + " " + maxSum);
    }

    private static int columnSum(int[][] arr, int col) {
        int total = 0;
        for (int row = 0; row < arr.length; row++) {
            total += arr[row][col];
        }
        return total;
    }


}
