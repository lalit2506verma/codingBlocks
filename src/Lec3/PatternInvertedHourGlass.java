package Lec3;

import java.util.Scanner;

public class PatternInvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = 2*n - 1;
        int row = 1;
        int col = n;
        while(row <= 2*n+1){
            // star
            int i = 1;
            int val = col;
            while(i <= star){
                System.out.print(val-- +" ");
                i++;
            }

            // space
            int j = 1;
            while(j <= space){
                System.out.print("  ");
                j++;
            }

            // star
            int k = 1;
            if(row == n+1){
                k = 2;
                ++val;
            }
            while(k <= star){
                System.out.print(++val +" ");
                k++;
            }

            // mirror
            if(row < n+1){
                space-=2;
                star++;
            }
            else{
                space+=2;
                star--;
            }

            row++;
            System.out.println();
        }
    }
}
