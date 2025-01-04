package Lec9;

// https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
    public static void main(String[] args) {

    }


    public static int Moore_Voting(int[] arr){
        int count = 0;
        int candidate = 0;

        for(int num : arr){
            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
