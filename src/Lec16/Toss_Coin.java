package Lec16;

public class Toss_Coin {
    public static void main(String[] args) {
        int n = 3;
        String ans = "";
        Print(n, ans);
    }

    private static void Print(int n, String s) {
        if(n == 0){
            System.out.println(s);
            return;
        }

        Print(n-1, s+"H");
        Print(n-1, s+"T");
    }

}
