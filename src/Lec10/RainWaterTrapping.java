package Lec10;

import java.util.Scanner;

// https://hack.codingblocks.com/app/contests/7258/327/problem
public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }

            System.out.println(waterStored(nums));
        }
    }

    public static int waterStored(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = nums[0];

        for(int i =1; i < n; i++){
            left[i] = Math.max(left[i-1], nums[i]);
        }

        int[] right = new int[n];
        right[n-1] = nums[n-1];

        for(int j = n-2; j >= 0; j--){
            right[j] = Math.max(right[j+1],nums[j]);
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.min(left[i], right[i]) - nums[i];
        }
        return sum;

    }


}
