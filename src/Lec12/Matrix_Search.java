package Lec12;

import java.util.Scanner;

public class Matrix_Search {
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

        int target = sc.nextInt();
        System.out.println(matrixSearch(arr, target));
    }

    public static int matrixSearch(int[][] arr, int target) {
        int i = 0;
        int j = arr[0].length-1;

        while(i < arr.length && j >= 0){
            if(arr[i][j] == target){
                return 1;
            }
            else if(arr[i][j] < target){
                i++;
            }
            else{
                j--;
            }
        }

        return 0;
    }


}
