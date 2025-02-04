package Lec16;

public class Maze_Path {
    public static void main(String[] args) {
        int n = 3; // no. of rows
        int m = 3; // no. of column
        Print_path(0, 0, n-1, m-1, "");

    }

    public static void Print_path(int cr, int cc, int er, int ec, String ans){
        if(cc == ec && cr == er){
            System.out.println(ans);
            return;
        }

        if(cr > er || cc > ec){
            return;
        }
        Print_path(cr, cc+1, er, ec, ans+"H");
        Print_path(cr+1, cc, er, ec, ans+"V");
    }
}
