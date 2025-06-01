package Lec42;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        System.out.println(Math.min(minCostClimbingStairs(cost, 0, dp), minCostClimbingStairs(cost, 1, dp)));
    }

    public static int minCostClimbingStairs(int[] cost, int i, int[] dp) {

        if(i >= cost.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int setp1 = minCostClimbingStairs(cost, i+1, dp);
        int setp2 = minCostClimbingStairs(cost, i+2, dp);

        return dp[i] = Math.min(setp1, setp2) + cost[i];

    }
}
