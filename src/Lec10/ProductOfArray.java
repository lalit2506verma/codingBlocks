package Lec10;

import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        long[] res = runningProduct(arr);

        for(long p : res){
            System.out.print(p + " ");
        }
    }

    public static long[] runningProduct(int[] arr){
        int n = arr.length;
        long[] prefixProduct = new long[n];
        prefixProduct[0] = 1;

        for(int i = 1; i < n; i++){
            prefixProduct[i] = prefixProduct[i-1] * arr[i-1];
        }

        long[] suffixProduct = new long[n];
        suffixProduct[n-1] = 1;

        for(int i = n-2; i >= 0; i--){
            suffixProduct[i] = suffixProduct[i+1] * arr[i+1];
        }

        for(int i = 0; i < n; i++){
            prefixProduct[i] *= suffixProduct[i];
        }

        return prefixProduct;
    }
}
