package Lec22;

public class Maximum_Sum_of_Size_K {
    public static void main(String[] args) {
        int[] arr = {2,3, 5, 1, 7, 9, 5, 2};
        System.out.println(Maximum_Sum(arr, 3));
    }

    public static int Maximum_Sum(int[] arr, int k){
        int ans = 0, sum = 0;
        for(int i = 0; i < k; i++){
            sum+= arr[i];
        }

        ans = sum;
        for(int i = k; i < arr.length; i++){
            sum += arr[i]; //grow
            sum -= arr[i-k]; //shrink
            ans = Math.max(ans, sum); // ans cal
        }

        return ans;
    }
}
