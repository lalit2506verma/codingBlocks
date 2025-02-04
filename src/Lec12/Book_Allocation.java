package Lec12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Book_Allocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(); // no. of books
            int m = sc.nextInt(); // no of students

            int[] pages = new int[n];

            for (int i = 0; i < n; i++) {
                pages[i] = sc.nextInt();
            }

            System.out.println(maxPages(pages, m));
        }


    }

    // brute force
    private static int maxPages(int[] pages, int  m) {
        // impossible allocation
        if(pages.length < m){
            return -1;
        }

        int low = Arrays.stream(pages).max().getAsInt();

        int high = Arrays.stream(pages).sum();

        while(low <= high){
            int mid = low + (high - low)/2;

            int count = countStudent(pages, mid);
            if(count > m){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return low;
    }

    private static int countStudent(int[] pages, int i) {
        int student = 1;
        int studentPages = 0;

        for (int j = 0; j < pages.length; j++) {
            if(studentPages + pages[j] <= i){
                studentPages += pages[j];
            }
            else{
                studentPages = pages[j];
                student++;
            }
        }
        return student;
    }

}
