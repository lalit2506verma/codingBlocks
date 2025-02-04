package Lec12;

import java.util.Scanner;

public class Murthal_parantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paratha = sc.nextInt();
        int n = sc.nextInt();

        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            ranks[i] = sc.nextInt();
        }

        System.out.println(time_req(ranks, paratha));

    }

    public static int time_req(int[] ranks, int paratha){
        return 0;
    }
}
