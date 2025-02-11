package Lec19;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partition {
    public static void main(String[] args) {
        String ques = "nitin";
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        partition(ques, list, ans);
        System.out.println(ans);

    }

    public static void partition(String ques, List<String> list, List<List<String>> ans){
        if(ques.length() == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if(isPalindrome(s)){
                list.add(s);
                partition(ques.substring(i), list, ans);
                list.removeLast();
            }

        }
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
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
