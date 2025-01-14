package Lec9;

import java.util.Scanner;

public class PairOfRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int nor = sc.nextInt(); // No. of roses available
            int[] roses = new int[nor];
            for(int j = 0; j < nor; j++){
                roses[j] = sc.nextInt();
            }
            int target = sc.nextInt();
            pair(roses, target);
            System.out.println();
        }

    }

    public static void pair(int[] arr, int target){
        int priceDiff = arr.length;
        int r1 = 0;
        int r2 = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    int diff = Math.abs(arr[i] - arr[j]);
                    if(diff < priceDiff){
                        priceDiff = diff;
                        r1 = Math.min(arr[i], arr[j]);
                        r2 = Math.max(arr[i], arr[j]);
                    }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are " + r1 + " and " + r2 + ".");
    }
}
