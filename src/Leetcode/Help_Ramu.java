package Leetcode;

import java.util.Scanner;

// https://codeskiller.codingblocks.com/problems/1089
public class Help_Ramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for(int j = 0; j < k; j++){
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            int n = sc.nextInt(); // No. of rickshaw
            int m = sc.nextInt(); // No. of cab

            int[] ride_rickshaw = new int[n];
            int[] ride_cab = new int[m];

            for(int i = 0; i < n; i++){
                ride_rickshaw[i] = sc.nextInt();
            }

            for(int i = 0; i < m; i++){
                ride_cab[i] = sc.nextInt();
            }

            System.out.println(minAmount(c1, c2, c3, c4, ride_rickshaw, ride_cab));
        }

    }

    public static int minAmount(int c1, int c2, int c3, int c4, int[] ride_rickshaw, int[] ride_cab){
        int costRickshaw = 0;
        for(int i = 0; i < ride_rickshaw.length; i++){
            costRickshaw += Math.min((ride_rickshaw[i] * c1), c2);
        }

        costRickshaw = Math.min(costRickshaw, c3);

        int costCab = 0;
        for(int i = 0; i < ride_cab.length; i++){
            costCab += Math.min((ride_cab[i] * c1), c2);
        }

        costCab = Math.min(costCab, c3);

        int totalCost = costCab + costRickshaw;

        return Math.min(totalCost, c4);
    }

}
