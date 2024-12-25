package Lec6;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        minInvert(n);
    }

    public static void minInvert(String n){
        StringBuilder st = new StringBuilder();

        for(int i = 0; i < n.length(); i++){
            int c = n.charAt(i) - '0';
            if(i != 0 && c >= 5){
                c = 9 - c;
            }
            st.append(c);
        }
        System.out.println(st.toString());
    }
}
