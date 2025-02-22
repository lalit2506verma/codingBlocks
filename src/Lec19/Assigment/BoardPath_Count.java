package Lec19.Assigment;

import java.util.Scanner;

public class BoardPath_Count {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of the board
        int m = sc.nextInt(); // face of the dice

        countPath(n, m, 0, "");
        System.out.print("\n"+count);
    }

    private static void countPath(int n, int m, int currPos, String ans) {
        if(currPos == n){
            System.out.print(ans+" ");
            count++;
            return;
        }
        if(currPos > n){
            return;
        }

        for (int face = 1; face <= m; face++) {
            countPath(n, m, currPos+face, ans+face);
        }
    }


}
