package Lec16;

public class Coin_Toss2 {
    public static void main(String[] args) {
        int n = 4;
        String ans = "";
        Print(n, ans);
    }

    private static void Print(int n, String s) {
        if(n == 0){
            System.out.println(s);
            return;
        }
         if(!s.endsWith("H")){
             Print(n-1, s+"H");
         }
        Print(n-1, s+"T");
    }
}
