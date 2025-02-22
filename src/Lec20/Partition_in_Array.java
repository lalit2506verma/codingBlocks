package Lec20;

import java.util.Arrays;

public class Partition_in_Array {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 1, 8, 3, 4};
        System.out.println(Partition(arr, 0, arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }

    public static int Partition(int[] arr, int s, int e){
        int item = arr[e];

        int idx = s;
        for (int i = s; i < e; i++) {
            if(arr[i] < item){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }

        }

        int temp = arr[e];
        arr[e] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}
