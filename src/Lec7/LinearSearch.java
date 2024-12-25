package Lec7;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        int item = 15;
        System.out.println(find(arr, item));
    }

    public static int find(int[] arr, int item){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }
}

