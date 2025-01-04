package Lec10;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] arr = new int[t];
        for(int i = 0; i < t; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr);
        for(int n : arr){
            System.out.println(n);
        }
    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


}
