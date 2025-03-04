package Lec23;

public class Power {
    public static void main(String[] args) {
        int x = 3;
        int n = 5;

        System.out.println(power(x, n));
    }

    private static int power(int x, int n) {
        if(n == 0){
            return 1;
        }

        int ans = power(x, n/2);
        ans = ans * ans;
        if(n % 2 != 0){
            ans *= x;
        }
        return ans;
    }
}
