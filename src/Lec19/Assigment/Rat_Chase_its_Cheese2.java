package Lec19.Assigment;

import java.util.Scanner;

public class Rat_Chase_its_Cheese2 {
    static boolean flag = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] maze = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = s.charAt(j);
            }
        }

        int[][] ans = new int[n][m];

        findRoute(maze, 0, 0, ans);

        if(!flag){
            System.out.println("NO PATH FOUND");
        }
    }

    private static void findRoute(char[][] maze, int row, int col, int[][] ans) {
        if(row < 0 || row >= maze.length || col < 0 || col >= maze[0].length || maze[row][col] == 'X'){
            return;
        }

        if(row == maze.length-1 && col == maze[0].length-1){
            flag = true;
            ans[row][col] = 1;
            display(ans);
            return;
        }

        //blocking the curr position
        maze[row][col] = 'X';
        ans[row][col] = 1;

        int[] r = {0, -1, 0, 1};
        int[] c = {1, 0, -1, 0};

        for (int i = 0; i < r.length; i++) {
            findRoute(maze, row+r[i], col+c[i], ans);
        }

        maze[row][col] = '0';
        ans[row][col] = 0;
    }

    private static void display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
