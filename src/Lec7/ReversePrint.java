package Lec7;

public class ReversePrint {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        reverse(arr);
    }

    public static void reverse(int[] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]+ " ");
        }

    }
}
