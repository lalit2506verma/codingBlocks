package Lec10;

import java.util.Scanner;

public class SortZeroAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);

        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    public static void sort(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            if(arr[i] == 1){
                if(arr[j] != 1){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
    }
}
