package Lec6;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int i = 1;
        int count = 1;
        while(count <= n1){
            int temp = (3 * i) + 2;
            if(temp % n2 == 0){
                i++;
                continue;
            }
            System.out.println(temp);
            count++;
            i++;
        }
    }
}
