package Lec12;

import java.util.Scanner;

public class Piyush_And_Magical_Park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int k = sc.nextInt();
        int s = sc.nextInt();

        String[][] park = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                park[i][j] = sc.next();
            }
        }
        int stren = escapePark(park, k, s);
        if(stren != 0){
            System.out.println(stren);
        }
    }

    public static int escapePark(String[][] arr, int k, int s){
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                // at any point strength lowers than the threshold
                if(s < k){
                    System.out.println("No");
                    return 0;
                }

                if(arr[i][j].equals(".")){
                    s -= 3;
                }

                if(arr[i][j].equals("*")){
                    s += 4;
                }

                if(arr[i][j].equals("#")){
                    break;
                }

                if(j == m-1){
                    s+=1;
                }
            }
        }

        System.out.println("Yes");
        return s;
    }
}
