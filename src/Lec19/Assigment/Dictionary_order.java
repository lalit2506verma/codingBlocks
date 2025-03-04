package Lec19.Assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dictionary_order {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        List<String> list = new ArrayList<>();
        lexicographicalOrder(s, s,"", list);
        Collections.sort(list);
        for(String str : list){
            System.out.println(str);
        }
    }

    private static void lexicographicalOrder(String s, String ques, String ans, List<String> list) {
        if(ques.isEmpty()){
            if(ans.compareTo(s) > 0){
                list.add(ans);
            }
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0, i);
            String s2 = ques.substring(i+1);

            lexicographicalOrder(s,s1+s2, ans+ch, list);
        }
    }

}
