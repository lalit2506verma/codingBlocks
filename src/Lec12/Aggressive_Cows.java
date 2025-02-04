package Lec12;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of stalls
        int c = sc.nextInt(); // number of cows

        int[] stalls = new int[n];

        for(int i = 0; i < n; i++){
            stalls[i] = sc.nextInt();
        }
        System.out.println(countCows(stalls, c));
    }

    public static int countCows(int[] stalls, int c) {
        Arrays.sort(stalls);

        int low = 0;
        int high = stalls[stalls.length - 1];
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isPossible(stalls, mid, c)){
                ans = mid;
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] stalls, int mid, int c) {
        int cow = 1; // initially placing 1st cow at first stall -> stalls[0]
        int poc = stalls[0];

        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - poc >= mid){
                poc = stalls[i];
                cow++;
            }

            if(cow == c){
                return true;
            }
        }

        return false;

    }
}
