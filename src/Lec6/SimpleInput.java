package Lec6;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cumSum = 0;

        while(true){
            int n = sc.nextInt();
            cumSum += n;
            if(cumSum < 0){
                break;
            }
            System.out.println(n);
        }

    }

}
