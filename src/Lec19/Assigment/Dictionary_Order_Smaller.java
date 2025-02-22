package Lec19.Assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dictionary_Order_Smaller {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> res = smallerPermutations(s);

        for (String str : res){
            System.out.println(str);
        }

    }

    private static List<String> smallerPermutations(String s) {
        List<String> ans = new ArrayList<>();
        lexicographicalOrder(s, s,"", ans);

        Collections.sort(ans);
        return ans;
    }

    private static void lexicographicalOrder(String s, String ques, String str, List<String> ans) {
        if(ques.isEmpty()){
            if(str.compareTo(s) < 0){
                ans.add(str);
            }
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0, i);
            String s2 = ques.substring(i+1);

            lexicographicalOrder(s, s2+s1, str+ch, ans);
        }
    }
}
