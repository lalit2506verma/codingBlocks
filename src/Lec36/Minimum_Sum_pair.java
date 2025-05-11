package Lec36;

import java.util.PriorityQueue;

public class Minimum_Sum_pair {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        int sum = 0;
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            sum += (a+b);
            pq.add(a+b);
        }

        System.out.println(sum);

    }
}
