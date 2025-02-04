package Lec12;

import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(square_root(n));
    }

    public static long square_root(long n){
        long low = 0;
        long high = n / 2;

        while(low <= high){
            long mid = low + (high - low) / 2;

            if((mid*mid) == n){
                return mid;
            }
            else if((mid*mid) < n){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }

        return high;
    }
}
