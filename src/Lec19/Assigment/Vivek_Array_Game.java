package Lec19.Assigment;

import java.util.Scanner;

public class Vivek_Array_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            maxScore(arr);
        }
    }

    private static void maxScore(int[] arr) {
        
    }
}
