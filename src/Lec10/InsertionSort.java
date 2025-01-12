package Lec10;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i= 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);

        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    public static void sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int v = arr[i];
            int j = i -1;

            while(j >= 0 && arr[j] > v){
                arr[j+1] = arr[j];
                arr[j] = v;
                j--;
            }
        }
    }
}
