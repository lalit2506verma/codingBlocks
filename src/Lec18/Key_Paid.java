package Lec18;

import java.util.ArrayList;
import java.util.List;

public class Key_Paid {
    static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        String str = "23";
        List<String> list = new ArrayList<>();
        keyPaid(str, "", list);
        System.out.println(list);

    }

    public static void keyPaid(String ques, String ans, List<String> list){
        if(ques.length() == 0){
            list.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String s = key[ch - '0']; // abc

        for (int i = 0; i < s.length(); i++) {
            keyPaid(ques.substring(1), ans + s.charAt(i), list);
        }
    }
}
