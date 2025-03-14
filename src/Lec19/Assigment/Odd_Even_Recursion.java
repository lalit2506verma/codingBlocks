package Lec19.Assigment;

import java.util.Scanner;

public class Odd_Even_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOddDescending(n);
        printEvenAscending(1, n);
    }

    public static void printOddDescending(int n){
        if(n <= 0){
            return;
        }

        if(n % 2 != 0){
            System.out.println(n + " ");
        }
        printOddDescending(n-1);
    }

    public static void printEvenAscending(int current, int n){
        if(current > n){
            return;
        }

        if(current % 2 == 0){
            System.out.println(current + " ");
        }
        printEvenAscending(current+1, n);
    }
}
