package Lec19.Assigment;

import java.util.Scanner;

public class MazePath_Count {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        possiblePath(n, m, 0, 0, "");
        System.out.println("\n"+count);
    }

    private static void possiblePath(int n, int m, int currRow, int currCol, String ans) {
        if(currRow == n-1 && currCol == m-1){
            System.out.print(ans+ " ");
            count++;
        }

        if(currRow > n || currCol > m){
            return;
        }

        // vertical down (x, y) -> (x+1, y)
        possiblePath(n, m, currRow+1, currCol, ans+"V");

        // horizontal right (x, y) -> (x, y+1)
        possiblePath(n, m, currRow, currCol+1, ans+"H");
    }
}
