package Lec13;

public class Print_SubString {
    public static void main(String[] args) {
       String s = "Hello";
       subString(s);

    }

    public static void subString(String s){
        for (int i = 0; i < s.length(); i++) {
            for(int j = i+ 1; j <= s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
