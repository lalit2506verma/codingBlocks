package Lec8;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);

        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        for(int i = 0; i < k; i++){
            int temp = nums[n-1];

            for(int j = n-2; j >= 0; j--){
                nums[j+1] = nums[j];
            }

            nums[0] = temp;
        }
    }
}
