package Lec4;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 0;
        while(row < n){
            //patttern
            int i = 0;
            int ncr = 1;
            while(i < star){
                System.out.print(ncr +"\t");
                ncr =  ((row - i) * ncr)/ (i+1);
                i++;
            }

            row++;
            star++;
            System.out.println();
        }
    }
}
