package Lec10;

public class kthRoot {
    public static void main(String[] args) {
        int n = 147;
        int k = 3;
        System.out.println(root(n, k));
    }

    public static int root(int n, int k){
        int low = 1;
        int high = n;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(Math.pow(mid, k) <= n){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }
}
