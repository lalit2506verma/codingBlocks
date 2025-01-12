package Lec12;

import java.util.Scanner;

public class User_input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // row
        int m = sc.nextInt(); // column

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }

        }

        display(arr);

    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
