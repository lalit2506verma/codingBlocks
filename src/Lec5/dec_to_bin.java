package Lec5;

import java.util.Scanner;

public class dec_to_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int sum = 0;
        int mul = 1;

        while(n > 0){
            int rem = n % 2;
            sum += (rem* mul);
            n /= 2;
            mul *= 10;
        }

        System.out.println(sum);
    }
}
