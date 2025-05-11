package Lec36;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Room_2 {
    public static void main(String[] args) {

    }

    public static int minMeetingsRooms(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if(pq.peek()[1] <= intervals[i][0]){
                pq.add(intervals[i]);
            }
            else{
                pq.poll();
                pq.add(intervals[i]);
            }
        }
        return pq.size();
    }
}
