package Leetcode;

import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};

        permutation(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void permutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            reverse(nums, 0, n-1);
        }

        for(int i = n -1; i > idx; i--){
            if(nums[i] > nums[idx]){
                swap(nums, i, idx);
            }
        }

        reverse(nums, idx+1, n-1);

    }

    public static void swap(int[] nums, int p, int q){
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
