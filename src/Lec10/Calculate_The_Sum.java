package Lec10;

import java.util.Arrays;
import java.util.Scanner;

public class Calculate_The_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int k = sc.nextInt();

            maxCalculateSum(arr, k);
        }

        int sum = 0;
        for(int a : arr){
            sum += a;
        }

        System.out.println((int)(sum % (Math.pow(10, 9) + 7)) );
    }

    public static void maxCalculateSum(int[] arr, int x){
        int n = arr.length;
        int[] temp = Arrays.copyOf(arr, n);
        for(int i = 0; i < n; i++){
            arr[i] = temp[i] + temp[(i - 1 + n) % n];
        }
    }
}
