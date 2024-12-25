package Lec6;

import java.util.Scanner;

public class SumOfOddEvenPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddEvenSum(n);
    }

    public static void oddEvenSum(int n){
        int oddSum = 0;
        int evenSum = 0;
        int count = 1;
        while(n > 0){
            int rem = n % 10;
            if(count % 2 == 0){
                evenSum += rem;
            }
            else{
                oddSum += rem;
            }

            count++;
            n /= 10;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
