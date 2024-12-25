package Lec7;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9, 7};
        Reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Reverse(int[] arr){
        int n = arr.length;
        for(int i = 0; i < arr.length/2; i++){
            swap(arr, i, n-i-1);
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
