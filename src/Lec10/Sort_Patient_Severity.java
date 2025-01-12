package Lec10;

import java.util.Scanner;

public class Sort_Patient_Severity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sortArray(arr);

        for(int a : arr){
            System.out.println(a + " ");
        }
    }

    public static void sortArray(int[] arr) {
        int[] count = new int[3];

        for(int a : arr){
            if(a == 0){
                count[0]++;
            }
            else if(a == 1){
                count[1]++;
            }
            else if(a == 2){
                count[2]++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(count[0] > 0){
                arr[i] = 0;
                count[0]--;
                continue;
            }
            if(count[1] > 0){
                arr[i] = 1;
                count[1]--;
                continue;
            }
            if(count[2] > 0){
                arr[i] = 2;
                count[2]--;
            }
        }
    }


}
