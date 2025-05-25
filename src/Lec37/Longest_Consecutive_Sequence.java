package Lec37;

import java.util.HashSet;

public class Longest_Consecutive_Sequence {

    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int s : nums){
            set.add(s);
        }

        int ans = 0;

        for(int s : nums){
            if(!set.contains(s-1)){
                // start of sequence
                int c= 0;
                while(set.contains(s)){
                    c++;
                    set.remove(s);
                    s++;
                }

                ans = Math.max(ans, c);
            }
        }

        return ans;
    }
}
