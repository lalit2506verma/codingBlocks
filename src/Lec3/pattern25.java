package Lec3;

import java.util.Scanner;

public class pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        int val = 1;

        int space = n-1;
        while(row <= n){
            //space
            int i = 0;
            while(i <= space){
                System.out.print("\t");
                i++;
            }

            //star
            int j = 1;
            while(j <= star){
                System.out.print(val++ +"\t");
                j++;
            }

            System.out.println();
            row++;
            space--;
            star+=2;
        }
    }
}
