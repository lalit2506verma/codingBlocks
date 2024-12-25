package Lec6;

import java.util.Scanner;

public class Fahren_to_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minFah = sc.nextInt();
        int maxFah = sc.nextInt();
        int step = sc.nextInt();

        while(minFah <= maxFah){
            int fah = celsius(minFah);

            System.out.print(minFah+"\t");
            System.out.println(fah);
            minFah += step;
        }
    }

    public static int celsius(int fah){
        float temp = (float) 5 / 9;
        double cel = (fah - 32) * temp;

        return (int)cel;
    }
}
