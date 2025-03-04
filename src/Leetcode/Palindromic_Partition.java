package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Palindromic_Partition {
    public static void main(String[] args) {
        String s = "nitin";
        List<String> list = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();

        palindrome(s, list, ans);
        System.out.println(ans);
    }

    public static void palindrome(String ques, List<String> list, List<List<String>> ans){
        if(ques.length() == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if(isPalindrome(s)){
                list.add(s);
                palindrome(ques.substring(i), list, ans);
                list.remove(s);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
