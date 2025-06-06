package Lec42;

import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 3, 1};

        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(Robber(arr, 0));
        System.out.println(RobberTD(arr, 0, dp));
    }

    public static int Robber(int[] arr, int i){

        if(i >= arr.length){
            return 0;
        }
        int rob = arr[i] + Robber(arr, i+2);
        int noRob = Robber(arr, i+1);

        return Math.max(rob, noRob);
    }

    // Top-down
    public static int RobberTD(int[] arr, int i, int[] dp){

        if(i >= arr.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }
        int rob = arr[i] + RobberTD(arr, i+2, dp);
        int noRob = RobberTD(arr, i+1, dp);

        return dp[i] = Math.max(rob, noRob);
    }


    // Bottom-Up
    public static int RobberBU(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }

        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < dp.length; i++) {
            int rob = arr[i] + dp[i-2];
            int noRob = dp[i-1];
            dp[i] = Math.max(rob, noRob);
        }

        return dp[dp.length - 1];
    }
}
