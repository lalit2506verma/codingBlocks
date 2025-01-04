package Lec9;

public class Kadanes_Algorithm {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSub(arr));
    }

    public static int maxSub(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);

            if(sum < 0){
                sum = 0;
            }
        }

        return maxSum;
    }
}
