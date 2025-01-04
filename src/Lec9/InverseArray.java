package Lec9;

import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i = 0; i < t; i++){
            arr[i] = sc.nextInt();
        }

        int[] res = inverse(arr);
        for(int num : res){
            System.out.print(num + " ");
        }

    }

    public static int[] inverse(int[] arr){
        int[] res =  new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            res[arr[i]] = i;
        }
        return res;
    }

}
