package Lec9;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int idx = MinimumIndex(arr, i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }

    public static int MinimumIndex(int[] arr, int idx){
        int min = idx;

        for(int i = idx + 1; i < arr.length; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }
}
