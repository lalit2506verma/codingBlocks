package Lec3;

import java.util.Scanner;

public class PatternWithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;

        while(row <= n){
            //patttern
            int i = 1;
            int val = 0;
            while(i <= star){
                if(i == 1 || i == star){
                   val = row;
                }
                else{
                    val = 0;
                }
                System.out.print(val +"\t");
                i++;
            }

            row++;
            star++;
            System.out.println();
        }
    }
}
