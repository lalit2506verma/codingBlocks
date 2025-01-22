package Lec15;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }

    public static int fact(int n){

        if (n == 0) {
            return 1;
        }
        int f =  fact(n-1);

        return f*n;
    }
}
