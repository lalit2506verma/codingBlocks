package Lec19.Assigment;

import java.util.Scanner;

public class MazePath_D {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        possiblePaths(n, m, 0, 0, "");
        System.out.println("\n"+count);
    }

    private static void possiblePaths(int n, int m, int currRow, int currCol, String ans) {
        if(currRow == n-1 && currCol == m-1){
            System.out.print(ans+ " ");
            count++;
        }

        if(currRow > n || currCol > m){
            return;
        }

        // vertical down (x, y) -> (x+1, y)
        possiblePaths(n, m, currRow+1, currCol, ans+"V");

        // horizontal right (x, y) -> (x, y+1)
        possiblePaths(n, m, currRow, currCol+1, ans+"H");

        // Diagonally south-east (x, y) -> (x+1, y+1)
        possiblePaths(n, m, currRow+1, currCol+1, ans+"D");
    }
}
