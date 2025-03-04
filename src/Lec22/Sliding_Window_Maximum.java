package Lec22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(Window_Maximum(arr, 3)));
    }

    public static int[] Window_Maximum(int[] arr, int k){
        int n = arr.length;
        int[] max_Val = new int[n-k+1];
        List<Integer> ll = new ArrayList<>();

        //1st window Maximum
        for(int i = 0; i < k; i++){
            while(!ll.isEmpty() && arr[ll.getLast()] < arr[i]){
                ll.removeLast();
            }

            ll.add(i);
        }
        int j = 0;
        max_Val[j++] = arr[ll.getFirst()];

        for(int i= k; i < arr.length; i++){
            //grow
            while(!ll.isEmpty() && arr[ll.getLast()] < arr[i]){
                ll.removeLast();
            }
            ll.add(i);

            // shrink
            if(ll.getFirst() == i-k){
                ll.removeFirst();
            }

            // ans update
            max_Val[j++] = arr[ll.getFirst()];
        }

        return max_Val;
    }
}
