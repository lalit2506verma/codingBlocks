package Lec3;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        int row = 1;

        while(row <= n){
            //space
            int i = 1;
            while(i <= space){
                System.out.print(" ");
                i++;
            }

            // star
            int j = 1;
            while(j <= n){
                if(row == 1 || row == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }

            row++;
            space--;
            System.out.println();
        }
    }

}
