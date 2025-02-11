package Lec19;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

    public static void main(String[] args) {
        int[] coins = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        permutation(coins, target, list, 0, ans);
        System.out.println(ans);
    }

    public static void permutation(int[] coins, int target, List<Integer> ll, int idx, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < coins.length; i++) {
            if(target >= coins[i]){
                ll.add(coins[i]);
                permutation(coins, target-coins[i], ll, i, ans);
                ll.removeLast();
            }
        }
    }

}
