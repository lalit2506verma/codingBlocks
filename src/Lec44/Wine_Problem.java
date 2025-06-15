package Lec44;

public class Wine_Problem {
    public static void main(String[] args) {

    }

    public static int maximum_profit_bottom_up(int[] wine){
        int[][] dp = new int[wine.length][wine.length];
        int year = wine.length;
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = wine[i] * year;
        }
        year--;

        for (int gap = 1; gap < dp.length; gap++) {
            for (int j = gap; j < dp.length; j++) {
                int i = j - gap;

                int first = wine[i] * year + dp[i+1][j];
                int last = wine[j] * year + dp[i][j-1];
                dp[i][j] = Math.max(first, last);

            }
            year--;
        }
        return dp[0][dp[0].length-1];
    }

    public static int maximum_profit(int[] wine, int i, int j, int year, int[][] dp){
        if(i < j){
            return 0;
        }
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        int first = wine[i] * year + maximum_profit(wine, i+1, j, year+1, dp);
        int last = wine[i] * year + maximum_profit(wine, i, j-1, year+1, dp);

        return dp[i][j] = Math.max(first, last);
    }
}
