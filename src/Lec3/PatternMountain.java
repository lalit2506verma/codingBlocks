package Lec3;

import java.util.Scanner;

public class PatternMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = (2*n)-3;
        int star = 1;
        while(row <= n){
            int val = 1;
            //pattern
            int i = 1;
            while(i <= star){
                System.out.print(val++ +"\t");
                i++;
            }

            //spaces
            int j = 1;
            while(j <= space){
                System.out.print("\t");
                j++;
            }

            //for pattern
            int k = 1;
            if(row == n){
                k = 2;
                --val;
            }
            while(k <= star){
                System.out.print(--val +"\t");
                k++;
            }

            row++;
            star++;
            space-=2;
            System.out.println();
        }
    }
}
