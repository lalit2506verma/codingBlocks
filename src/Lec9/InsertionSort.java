package Lec9;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 0, -1, 11, 6, 8, 9, 4};
        //System.out.println(insertLastElement(arr, arr.length-1));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insertLastElement(arr, i);
        }
    }

    public static void insertLastElement(int[] arr, int i){
        int v = arr[i];
        int j = i - 1;
        while(j >= 0 && arr[j] > v){
            arr[j+1] = arr[j];
            arr[j] = v;
            j--;
        }

    }
}
