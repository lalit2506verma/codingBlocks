package Lec9;

import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i = 0; i < t; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
