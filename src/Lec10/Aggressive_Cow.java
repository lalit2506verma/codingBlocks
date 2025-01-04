package Lec10;

import java.util.Arrays;
import java.util.Scanner;

// https://www.spoj.com/problems/AGGRCOW/
public class Aggressive_Cow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int nos = sc.nextInt(); // No. of Stalls
            int noc = sc.nextInt(); // No. of cows
            int[] stall = new int[nos];
            for(int i = 0; i < stall.length; i++){
                stall[i] = sc.nextInt();
            }

            Arrays.sort(stall);
            System.out.println(minimumDistance(stall, noc));
        }
    }

    public static int minimumDistance(int[] stalls, int noc){
        int low = 0;
        int high = stalls[stalls.length-1] - stalls[0];
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isPossible(stalls, noc, mid)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }

    public static boolean isPossible(int[] stalls, int noc, int mid) {
        int cow = 1;
        int pos = stalls[0];

        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - pos >= mid){
                pos = stalls[i];
                cow++;
            }

            if(cow == noc){
                return true;
            }
        }

        return false;
    }
}
