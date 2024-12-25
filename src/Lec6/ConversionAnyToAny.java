package Lec6;

import java.util.Scanner;

public class ConversionAnyToAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int source = sc.nextInt();
        int des = sc.nextInt();
        int n = sc.nextInt();
        int res = 0;
        if(source != 10 && des != 10){
            int deci = sourceToDeci(n, source);
            res = deciToDestination(deci, des);
        }
        else if(source == 10){
            res = deciToDestination(n, des);
        }
        else {
            res = sourceToDeci(n, source);
        }

        System.out.println(res);
    }

    private static int deciToDestination(int n, int des) {
        int sum = 0;
        int mul = 1;

        while(n > 0){
            int rem = n % des;
            sum += (rem* mul);
            n /= des;
            mul *= 10;
        }
        return sum;
    }

    private static int sourceToDeci(int n, int source) {
        int sum = 0;
        int mul = 1;

        while(n > 0){
            int rem = n % 10;
            sum += (rem * mul);
            n = n/10;
            mul *= source;
        }
        return sum;
    }


}
