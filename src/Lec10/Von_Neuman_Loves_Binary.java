package Lec10;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 15 ; i < n; i++){
            long binary = sc.nextLong();

            System.out.println(convertDecimal(binary));
        }
    }

    private static long convertDecimal(long num) {
        long sum = 0;
        long mul = 1;

        while(num > 0){
            long rem = num % 10;
            sum += (rem * mul);
            mul *= 2;
            num /= 10;
        }
        return sum;
    }
}
