package Lec14;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_Sum_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of the first array
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        sumOfTwoArrays(arr1, arr2);

    }

    private static void sumOfTwoArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;

        while(i >= 0 && j >= 0){
            int sum = arr1[i] + arr2[j] + carry;
            list.add(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        while(i >= 0){
            int sum = arr1[i] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            i--;
        }
        while(j >= 0){
            int sum = arr2[j] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            j--;
        }

        if(carry != 0){
            list.add(carry);
        }

        for (int k = list.size()-1; k >= 0 ; k--) {
            System.out.print(list.get(k) + ", ");
        }
        System.out.println("END");
    }
}
