package Lec19.Assigment;

import java.util.Scanner;

public class Dictionary_order {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        lexicographicalOrder(s, s,"");
        System.out.println(count);
    }

    private static void lexicographicalOrder(String s, String ques, String ans) {
        if(ques.isEmpty()){
            if(ans.compareTo(s) > 0){
                System.out.println(ans);
                count++;
            }
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0, i);
            String s2 = ques.substring(i+1);

            lexicographicalOrder(s, s1+s2, ans+ch);
        }
    }

}
