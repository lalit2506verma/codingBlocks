package Lec10;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);

        for(int a : arr){
            System.out.println(a);
        }
    }

    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int idx = minimumIdx(arr, i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }

    public static int minimumIdx(int[] arr, int idx) {
        int min = idx;

        for(int i = min + 1; i < arr.length; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }

        return min;
    }
}
