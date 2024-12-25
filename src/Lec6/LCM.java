package Lec6;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = HCF(a, b);
        int lcm = (a * b) / hcf;
        System.out.println(lcm);
    }

    public static int HCF(int n1, int n2){
        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }
}
