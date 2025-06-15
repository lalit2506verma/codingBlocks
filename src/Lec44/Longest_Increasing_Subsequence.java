package Lec44;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {

    }

    public static int LIS(int[] arr){
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int len = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > dp[len - 1]){
                dp[len] = arr[i];
                len++;
            }
            else{
                int idx = BinarySearch(dp, 0, len -1, arr[i]);
                dp[idx] = arr[i];
            }
        }

        return len;
    }

    private static int BinarySearch(int[] dp, int low, int end, int target) {
        int ans = 0;
        while(low <= end){
            int mid = (low + end)/2;

            if(dp[mid] >= target){
                ans = mid;
                end = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
}
