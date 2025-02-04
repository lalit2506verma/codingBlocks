package Lec16;

public class Print_SubSequence {
    public static void main(String[] args) {
        String s= "abc";
        print(s, "");
    }

    private static void print(String s, String ans) {
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = s.charAt(0);
        print(s.substring(1), ans);
        print(s.substring(1), ans+ch);
    }
}
