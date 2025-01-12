package Lec10;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Target_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        targetSum(arr, target);
    }

    public static void targetSum(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;

        for(int i = 0; i < n-2; i++){

            int l = i+1;
            int r = n-1;
            int targetSum = target - arr[i];

            while(l < r){
                if(arr[l] + arr[r] == targetSum){
                    System.out.println(arr[i] + ", " + arr[l] + " and " + arr[r]);
                }

                if(arr[l] + arr[r] < targetSum){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
    }
}
