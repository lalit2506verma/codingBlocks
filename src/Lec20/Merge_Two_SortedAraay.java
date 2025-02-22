package Lec20;

import java.util.Arrays;

public class Merge_Two_SortedAraay {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 7, 9};
        int[] arr2 = {2, 3, 5, 6, 7, 8, 10, 11, 12};
        System.out.println(Arrays.toString(Merge(arr1, arr2)));
    }

    public static int[] Merge(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[] arr = new int[n+m];

        int i = 0, k = 0, j = 0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }

            k++;
        }

        while(i < n){
            arr[k++] = arr1[i++];
        }

        while(j < m){
            arr[k++] = arr2[j++];
        }
        return arr;
    }
}
