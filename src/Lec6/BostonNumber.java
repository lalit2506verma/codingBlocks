package Lec6;

import java.util.Scanner;

public class BostonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (primeFactorSum(n) == digitSum(n)) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }

    public static int primeFactorSum(int n){
        int sum = 0;
        // Check for 2 as a factor
        while (n % 2 == 0) {
            sum += digitSum(2);
            n /= 2;
        }
        // Check for odd factors
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                sum += digitSum(i);
                n /= i;
            }
        }
        // If number is still greater than 2, it's a prime factor
        if (n > 2) {
            sum += digitSum(n);
        }
        return sum;
    }

    public static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
}
