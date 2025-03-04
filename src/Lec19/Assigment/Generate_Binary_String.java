package Lec19.Assigment;

import java.util.Scanner;

public class Generate_Binary_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            StringBuilder str = new StringBuilder();
            generateString(s, 0, str);
        }
    }

    public static void generateString(String s,int idx, StringBuilder str){
        if(str.length() == s.length()){
            System.out.print(str.toString() + " ");
            return;
        }

        if(s.charAt(idx) != '?'){
            str.append(s.charAt(idx));
            generateString(s, idx+1, str);
            str.deleteCharAt(str.length()-1);
        }
        else{
            str.append('0');
            generateString(s, idx+1, str);
            str.deleteCharAt(str.length()-1);

            str.append('1');
            generateString(s, idx+1, str);
            str.deleteCharAt(str.length()-1);
        }
    }
}
