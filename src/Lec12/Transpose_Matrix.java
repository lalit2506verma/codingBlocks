package Lec12;

import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
//        int[] [] arr = {{1,2,3,4},
//                        {5,6,7,8},
//                        {9,10,11,12},
//                        {13,14,15,16}};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows // columns

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Transpose(arr);
        for (int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void Transpose1(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(i < j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }

    public static void Transpose(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
