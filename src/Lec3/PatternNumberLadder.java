package Lec3;

import java.util.Scanner;

public class PatternNumberLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        int val = 1;
        while(row <= n){
            //patttern
            int i = 1;
            while(i <= star){
                System.out.print(val++ +"\t");
                i++;
            }

            row++;
            star++;
            System.out.println();
        }
    }
}
