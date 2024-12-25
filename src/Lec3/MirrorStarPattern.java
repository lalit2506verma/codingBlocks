package Lec3;

import java.util.Scanner;

public class MirrorStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = (n-1)/2;
        int row = 1;
        while(row <= n){
            //spaces
            int i = 1;
            while(i <= space){
                System.out.print("\t");
                i++;
            }

            //star
            int j = 1;
            while(j <= star){
                System.out.print("*\t");
                j++;
            }

            //mirror
            if(row <= n/2){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }

            //next line
            row++;
            System.out.println();
        }
    }


}
