package Lec12;

import java.util.Scanner;

public class Arrays_Wave_print_Row_Wise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printWave(arr);
    }

    private static void printWave(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {

            if(i % 2 == 0){
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
            else{
                for (int j = m-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.println("END");
    }
}
