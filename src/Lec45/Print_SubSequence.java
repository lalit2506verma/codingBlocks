package Lec45;

public class Print_SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        SubSequence(s);
    }

    private static void SubSequence(String s){
        int n = s.length();
        for (int i = 0; i < (1 << n); i++) {
            Print(s, i);
        }
    }

    private static void Print(String s, int i) {
        int pos = 0;
        String ans = "";
        while(i > 0){
            if((i & 1) != 0){
                ans += s.charAt(pos);
            }
            pos++;
            i >>= 1;
        }
        System.out.println(ans);
    }
}
