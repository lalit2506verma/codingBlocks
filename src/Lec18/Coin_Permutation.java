package Lec18;

public class Coin_Permutation {
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int target = 4;
        permutation(coins, target, "", 0);
    }

    public static void permutation(int[] coins, int target, String ans, int idx){
        if(target == 0){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < coins.length; i++) {
            if(target >= coins[i]){

                permutation(coins, target-coins[i], ans + coins[i], i);
            }
        }
    }
}
