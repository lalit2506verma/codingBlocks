package Lec10;

import java.util.Scanner;

public class nextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] arr = new int[t];
        for(int i= 0; i < t; i++){
            arr[i] = sc.nextInt();
        }

        int[] res = nextPermu(arr);

        for(int n : res){
            System.out.print(n + " ");
        }

    }

    public static int[] nextPermu(int[] arr) {
        int n = arr.length;
        int mark = -1;

        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                mark = i;
                break;
            }

        }

        if(mark == -1){
            reverse(arr, 0, n-1);
            return arr;
        }

        // checking just greater value than arr[idx];
        for(int j = n-1; j > mark; j--){
            if(arr[j] > arr[mark]){
                swap(arr, mark, j);
                break;
            }
        }

        reverse(arr, mark+1, n-1);
        return  arr;
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int mark, int j) {
        int temp = arr[mark];
        arr[mark] = arr[j];
        arr[j] = temp;
    }
}
