package Lec12;

import java.util.Arrays;
import java.util.Scanner;

public class Painters_partition_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = partition(arr, k);

        System.out.println(res);
    }

    public static int partition(int[] arr, int k) {
        int low = Arrays.stream(arr).max().getAsInt();

        int high = Arrays.stream(arr).sum();

        while(low <= high){
            int mid = low + (high - low) / 2;

            int countTime = countTime(arr, mid);

            if(countTime > k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return low;
    }

    private static int countTime(int[] arr, int mid) {
        int painter = 1;
        int painterTime = 0;

        for(int i = 0; i < arr.length; i++){
            if(painterTime + arr[i] > mid){
                painter++;
                painterTime = arr[i];
            }
            else{
                painterTime += arr[i];
            }
        }

        return painter;
    }
}
