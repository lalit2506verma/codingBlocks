package Lec12;

import java.util.Scanner;

public class kth_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            int k = sc.nextInt();

            System.out.println(kthRoot(n, k));
        }
    }

    public static long kthRoot(long n, int k){
        long low = 0;
        long high = n;
        long ans = 0;

        while(low <= high){
            long mid = low + (high - low) / 2;

            if(Math.pow(mid, k) <= n){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return ans;
    }
}
