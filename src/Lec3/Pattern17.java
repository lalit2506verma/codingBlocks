package Lec3;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n/2;
        int row = 1;
        int space = 1;
        while(row <= n){
            //star
            int i = 0;
            while(i < star){
                System.out.print(" * ");
                i++;
            }

            //spaces
            int j = 1;
            while(j <= space){
                System.out.print("   ");
                j++;
            }

            // star
            int k =0;
            while(k < star){
                System.out.print(" * ");
                k++;
            }

            // mirror
            if(row <= n/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }

            // next line
            row++;
            System.out.println();
        }
    }
}
