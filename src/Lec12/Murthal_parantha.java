package Lec12;

import java.util.Scanner;

public class Murthal_parantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();

        int[] ranks = new int[n];
        int maxRank = 0;
        for (int i = 0; i < n; i++) {
            ranks[i] = sc.nextInt();
            maxRank = Math.max(maxRank, ranks[i]);
        }

        int high = ((p * (p+1))/2 ) * maxRank;
        int low = 0;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(isPossible(ranks, p, n, mid)){
                ans = mid;
                high = mid - 1; // to check possible lower time
            }
            else{
                low = mid + 1;
            }
        }

        System.out.println(ans);

    }

    private static boolean isPossible(int[] ranks, int p, int n, int max_time) {
        int countParatha = 0;
        int cooktime = 0;

        // checking each cook one by one
        for (int i = 0; i < n; i++) {
            cooktime = ranks[i];  // timme for 1st paratha
            int rank = ranks[i];
            int cookCount = 1;

            while(cooktime <= max_time){
                cookCount++;
                cooktime += (cookCount * rank);
                countParatha++;

                if(countParatha == p){
                    return true;
                }
            }
        }

        return false;
    }
}
