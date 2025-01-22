package Lec15;

public class First_Occ {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 4, 6};
        int item = 4;

        System.out.println(index(arr, item, 0));
    }

    public static int index(int[] arr, int target, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }

        return index(arr, target, i+1);
    }

}
