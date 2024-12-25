package Lec4;

public class Fibo {
    public static void main(String[] args) {
        int n = 6;
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++){
            int sum = a + b;
            a = b;
            b = sum;
        }

        System.out.println(b);
    }
}
