package Lec6;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        replace(n);
    }

    public static void replace(String n){
        StringBuilder st = new StringBuilder();
        for(int i = 0; i < n.length(); i++){
            char c = n.charAt(i);
            if(c == '0'){
                c = '5';
            }
            st.append(c);
        }
        System.out.println(st.toString());
    }
}
