package Lec9;

import java.util.Arrays;
import java.util.Map;

// https://leetcode.com/problems/maximum-subarray/description/
public class maxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSub(arr));
    }

    public static int maxSub(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;

            for(int j = i; j < nums.length; j++){
                sum += nums[j];

                maxSum = Math.max(sum, maxSum);

            }
        }

        return maxSum;
    }

}
