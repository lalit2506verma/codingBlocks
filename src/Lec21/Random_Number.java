package Lec21;

import java.util.Random;

public class Random_Number {
    public static void main(String[] args) {
        int si = 10;
        int ei = 100;
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            int v = rd.nextInt(ei - si +1)+si;
            System.out.println(v);
        }
    }
}
