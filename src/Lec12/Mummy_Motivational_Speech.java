package Lec12;

import java.util.Scanner;

public class Mummy_Motivational_Speech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(isLowerTriangular(arr));
    }

    public static boolean isLowerTriangular(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i < j && arr[i][j] != 0){
                    return false;
                }
            }
        }

        return true;
    }
}
