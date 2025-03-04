package Lec23;

import java.util.Arrays;

// space complexity - > O(1);
// Best time complexity -> O(n)
// Worst Time complexity -> O(n^2)

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 1, 8, 3, 4};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int s, int e) {
        if(s >= e){
            return;
        }

        int idx = Partition(arr, s, e);
        sort(arr, s, idx-1);
        sort(arr, idx+1, e);
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
