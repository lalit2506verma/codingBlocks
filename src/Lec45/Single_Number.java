package Lec45;

public class Single_Number {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int xor = 0;
        for(int a : arr){
            xor ^= a;
        }

        System.out.println(xor);
    }
}
