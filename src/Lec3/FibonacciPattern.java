package Lec3;

import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = 1;
        int a = 0;
        int b = 1;
        int row = 1;
        while(row <= n){
            //pattern
            int i = 0;
            while(i < star){
                System.out.print(a +"\t");
                int sum = a + b;
                a = b;
                b = sum;
                i++;
            }

            //next line
            row++;
            star++;
            System.out.println();
        }
    }
}
