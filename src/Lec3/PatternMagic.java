package Lec3;

import java.util.Scanner;

public class PatternMagic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = -1;
        int star = n;
        while(row <= (2*n)-1){
            //for star
            int i = 1;
            while(i <= star){
                System.out.print("*");
                i++;
            }

            // for space
            int j = 1;
            while(j <= space){
                System.out.print(" ");
                j++;
            }

            // for pattern
            int k = 1;
            if(row == 1 || row == (2*n)-1){
                k = 2;
            }
            while(k <= star){
                System.out.print("*");
                k++;
            }

            // for mirror
            if(row < n){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }

            //next line
            row++;
            System.out.println();
        }

    }
}
