package Lec6;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            game(m, n);
        }


    }

    public static void game(int m, int n){ // m -> Ayush  n -> Harshit
        int sumAyush = 0;
        int sumHarshit = 0;
        int phone =1;

        while(true){
            sumAyush += phone;

            if(sumAyush > m){
                System.out.println("Harshit");
                break;
            }

            phone++;

            sumHarshit += phone;
            if(sumHarshit > n){
                System.out.println("Aayush");
                break;
            }
            phone++;
        }
    }

}
