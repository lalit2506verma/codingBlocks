package Lec1;

public class Arthmethic_Demo {
    public static void main(String[] args) {
        int x = 98;
        int y = 17;

        int a =  x+y;
        System.out.println(a);

        // updating the value
        a = x - y;
        System.out.println(a);

        int b = x * y;
        System.out.println(b);

        int c = x / y;
        System.out.println(c);

        c = x % y;
        System.out.println(c);


        // Simple Interest
        int p = 1000;
        int r =  5;
        int t = 1;

        int si = (p * r * t ) / 100;
        System.out.println(si);
    }


}
