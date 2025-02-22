package Lec19.Assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset_problem {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // length of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        subSet_Sum(arr, 0,target, 0, list);
        System.out.println("\n"+count);
    }

    private static void subSet_Sum(int[] arr, int idx, int target, int currSum, List<Integer> list) {
        if(currSum == target){
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.print(" ");
            count++;
            return;
        }
        if(idx == arr.length){
            return;
        }
        list.add(arr[idx]);
        // include the first element of the array
        subSet_Sum(arr, idx+1, target, currSum + arr[idx], list);

        // backtracking
        list.remove(list.size()-1);
        subSet_Sum(arr, idx+1, target, currSum, list);
    }
}
