package Lec3;

import java.util.Scanner;

public class Pattern_Rombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n-1;
        int row = 1;
        int val = 1;
        while(row <= 2*n-1){
            // space
            int i = 1;
            while(i <= space){
                System.out.print("\t");
                i++;
            }

            //star
            int j = 1;
            int p = val;
            while( j <= star){
                System.out.print(p + "\t");
                if(j <= star/2){
                    p++;
                }
                else{
                    p--;
                }
                j++;
            }
            //mirror
            if(row < n){
                space--;
                star+=2;
                val++;
            }
            else{
                space++;
                star-=2;
                val--;
            }
            row++;

            System.out.println();
        }
    }
}
