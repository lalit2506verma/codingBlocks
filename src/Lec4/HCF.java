package Lec4;

public class HCF {
    public static void main(String[] args) {
        int div = 16;
        int dividend = 60;

        while(dividend%div != 0){
            int rem = dividend % div;
            dividend = div;
            div = rem;
        }
        System.out.println(div);
    }
}
