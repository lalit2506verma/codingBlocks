package Lec23;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 4, 2};
        int[] ans = Sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] Sort(int[] arr, int s, int e){
        if(s == e){
            int[] b = new int[1];
            b[0] = arr[s];
            return b;
        }
        int mid = (s + e) / 2;

        int[] first = Sort(arr, s, mid);
        int[] second = Sort(arr, mid+1, e);

        return Merge(first, second);
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
