package Lec19.Assigment;

import java.util.Scanner;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        generate(n, 0, 0, "");
    }

    public static void generate(int n, int start, int end, String ans){
        if(start == n && end == n){
            System.out.println(ans);
            return;
        }

        if(start > n || end > start){
            return;
        }

        generate(n, start, end+1, ans+')');
        generate(n, start+1, end, ans+'(');
    }
}
