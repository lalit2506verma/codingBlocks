package Lec15;

public class factorial_Tail_Recursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n, 1));
    }

    public static int fact(int n, int ans){
        // base Case
        if (n == 0) {
            return ans;
        }

        return fact(n-1, ans * n);
    }
}
