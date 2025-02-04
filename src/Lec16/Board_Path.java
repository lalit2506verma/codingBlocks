package Lec16;


public class Board_Path {
    public static void main(String[] args) {
        int dice = 3;
        int ludo = 4;
        String s = "";
        int ans  = 0;

        print_comb(ludo, ans, s);
    }

    public static void print_comb(int ludo, int ans, String s){
        if(ans == ludo){
            System.out.println(s);
            return;
        }
        if(ans > ludo){
            return;
        }

        for(int dice = 1; dice <= 3; dice++){
            print_comb( ludo, ans+dice, s+dice);
        }
    }


}
