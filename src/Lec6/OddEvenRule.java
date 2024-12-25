package Lec6;

import java.util.Scanner;

public class OddEvenRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            isAllowed(num);
        }
    }

    public static void isAllowed(int num){
        int evenSum = 0;
        int oddSum = 0;

        while(num > 0){
            int rem = num % 10;
            if(rem % 2 == 0){
                //even
                evenSum += rem;
            }
            else{
                //odd
                oddSum += rem;
            }

            num /= 10;
        }

        if(evenSum % 4 == 0 || oddSum % 3 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
