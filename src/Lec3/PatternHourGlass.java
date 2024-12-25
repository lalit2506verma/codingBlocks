package Lec3;

import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 2*n+1;
        int space = 0;
        int colVal = n;
        while(row <= 2*n+1){
            // space
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }

            // pattern
            int j = 1;
            int val = colVal;
            while(j <= star){
                System.out.print(val+" ");
                if(j <= star/2){
                    val--;
                }
                else{
                    val++;
                }
                j++;
            }

            // Horizontal Mirror
            if(row < n+1){
                star-=2;
                space++;
                colVal--;
            }
            else{
                star+=2;
                space--;
                colVal++;
            }
            row++;

            System.out.println();
        }
    }
}
