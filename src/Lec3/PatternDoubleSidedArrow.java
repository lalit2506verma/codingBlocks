package Lec3;

import java.util.Scanner;

public class PatternDoubleSidedArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space1 = n-1;
        int space2 = -1;
        int row = 1;
        int colVal = 1;
        while(row <= n){
            // for space

            int i = 1;
            while(i <= space1){
                System.out.print("  ");
                i++;
            }

            // for pattern
            int j = 1;
            int val = colVal;
            while(j <= star){
                System.out.print(val-- +" ");
                j++;
            }

            // for space
            int k = 1;
            while(k <= space2){
                System.out.print("  ");
                k++;
            }

            // for pattern
            int l = 1;
            while(l <= star){
                if(row == 1 || row == n){
                    l++;
                    break;
                }
                System.out.print(++val +" ");
                l++;
            }

            //mirror
            if(row <= n/2){
                space1-=2;
                space2+=2;
                star++;
                colVal++;
            }
            else{
                space1+=2;
                space2-=2;
                star--;
                colVal--;
            }
            row++;
            System.out.println();

        }
    }
}
