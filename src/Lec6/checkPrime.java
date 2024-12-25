package Lec6;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
    }

    public static void isPrime(int num){
        boolean flag = false;

        for(int i = 2; i <= num-1; i++){
            if(num % i == 0){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }

    }
}
