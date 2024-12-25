package Lec6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
    }

    public static void fibo(int n){
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++){
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(b);
    }

}
