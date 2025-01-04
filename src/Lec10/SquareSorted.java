package Lec10;

import java.util.Scanner;

public class SquareSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i = 0; i < t; i++){
            arr[i] = sc.nextInt();
        }

        sortedSquare(arr);

        for(int n : arr){
            System.out.print(n);
        }

    }

    public static void sortedSquare(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)Math.pow(arr[i], 2);
        }

        // bubble sort
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
