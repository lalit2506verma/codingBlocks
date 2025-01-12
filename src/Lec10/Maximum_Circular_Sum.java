package Lec10;

import java.util.Scanner;

public class Maximum_Circular_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(maxCircularSum(arr));
        }
    }

    public static int maxCircularSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int j = i;
            int sum = 0;
            do{
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
                j = (j + 1) % n;
            }while(i != j);
        }

        return maxSum;
    }
}
