package Lec8;

import java.util.Arrays;

public class ReversalAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);

        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0 , n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    private static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
