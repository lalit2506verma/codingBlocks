package Lec9;

import java.util.Scanner;

public class Array_Target_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i = 0; i < t; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sort(arr);
        target_Sum(arr, target);
    }

    public static void target_Sum(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i +1; j < arr.length; j++){
                if(target - arr[i] == arr[j] ){
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
    }

    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
