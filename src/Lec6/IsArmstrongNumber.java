package Lec6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = countOfDigit(n);

        System.out.println(isArmstrong(n, len));
    }

    public static boolean isArmstrong(int n, int len){
        int sum = 0;
        int digit = n;
        while(n > 0){
            int rem = n % 10;
            sum += (Math.pow(rem, len));
            n /= 10;
        }

        if(sum == digit){
            return true;
        }
        return false;
    }

    public static int countOfDigit(int n){
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }

        return count;
    }
}
