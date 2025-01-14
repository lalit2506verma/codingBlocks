package Lec13;

import java.util.Scanner;

public class Playing_with_good_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(longestGoodString(s));
    }

    public static int longestGoodString(String s){
        int maxCount = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(isVowels(s.charAt(i))){
                count++;
            }
            else{
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }

        return Math.max(count, maxCount);
    }

    public static boolean isVowels(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }

        return false;
    }
}
