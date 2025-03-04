package Leetcode;

public class Number_Raised_to_Reverse {
    public static void main(String[] args) {
        long x = 57;
        long n = 35;

        System.out.println(power(x, n));
    }

    public static long power(long x, long n){
        // x^n

        if(x == 0){
            return 0;
        }

        if(n == 0){
            return 1;
        }

        return (x * power(x, n-1)) % 1000000000;
    }
}
