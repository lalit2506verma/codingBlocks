package Lec19.Assigment;

import java.util.Scanner;

public class Count_Remove_Replace {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        helper(str, 0, str1, str2);
    }

    public static void helper(String str, int idx, StringBuilder ans1, StringBuilder ans2){
        if(idx == str.length()){
            System.out.println(count);
            System.out.println(ans1.toString());
            System.out.println(ans2.toString());
            return;
        }

        if(idx >= 1 && str.charAt(idx) == 'i' && str.charAt(idx-1) == 'h'){
            count++;
            ans1.deleteCharAt(ans1.length()-1);
            ans2.deleteCharAt(ans2.length()-1);
            ans2.append("bye");
        }

        helper(str, idx+1, ans1.append(str.charAt(idx)), ans2.append(str.charAt(idx)));
    }


}
