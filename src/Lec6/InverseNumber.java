package Lec6;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(inverse(n));
    }

    public static int inverse(int n){
        int sum = 0;
        int place = 1;
        while(n > 0){
            int rem = n % 10;
            sum = (int) (sum + (place * Math.pow(10, rem-1)));
            n /= 10;
            place++;
        }

        return sum;
    }
}
