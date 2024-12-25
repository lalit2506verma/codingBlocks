package Lec3;

import java.util.Scanner;

public class Pattern_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n-1;
        int row = 1;
        while(row <= n){
            //spaces
            int i = 1;
            while(i <= space){
                System.out.print("\t");
                i++;
            }

            //for star
            int j = 1;
            int val = row;
            while(j <= star){
                System.out.print(val +"\t");
                if(j <= star/2){
                    val++;
                }
                else{
                    val--;
                }
                j++;
            }

            row++;
            star+=2;
            space--;
            System.out.println();
        }
    }
}
