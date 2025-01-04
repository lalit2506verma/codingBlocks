package Lec10;

import java.util.Scanner;

// https://hack.codingblocks.com/app/contests/7258/1094/problem
public class AlexShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i = 0; i < t; i++){
            arr[i] = sc.nextInt();
        }

        int queries = sc.nextInt();
        for(int i = 0; i < queries; i++){
            int A = sc.nextInt(); // Price of item;
            int k = sc.nextInt(); // no. of item predicted

            isPossible(arr, A, k);
        }
    }

    public static void isPossible(int[] prices, int a, int k) {
        int count = 0;
        for(int price : prices){
            if(price % a == 0 || a % price == 0){
                count++;
            }
        }

        if(count == k){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
