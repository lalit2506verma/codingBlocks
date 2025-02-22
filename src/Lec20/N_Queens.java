package Lec20;

public class N_Queens {
    public static void main(String[] args) {
        int n = 4;
        boolean [][] board = new boolean[n][n];

        Print(board, n, 0);
        
    }
    
    public static void Print(boolean[][] board, int tq, int row){
        if(tq == 0){
            Display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                Print(board, tq-1, row+1);
                board[row][col] = false;
                
            }
        }
    }

    private static void Display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // upward straight
        int r = row;
        while(r >= 0){
            if(board[r][col]){
                return false;
            }
            r--;
        }
        //right Diagonal

        r = row;
        int c = col;
        while(r >= 0 && c < board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }

        // left diagonal
        r = row;
        c = col;
        while(r >= 0 && c >= 0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        return true;
    }


}
