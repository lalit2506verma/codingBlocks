package Lec10;

import java.util.Scanner;

public class How_Many_questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] questions = new int[n][3];
        for(int i = 0; i < n; i++){
            questions[i][0] = sc.nextInt();
            questions[i][1] = sc.nextInt();
            questions[i][2] = sc.nextInt();
        }

        System.out.println(questionSolved(questions));

    }

    private static int questionSolved(int[][] questions) {
        int count = 0;
        for(int i = 0; i < questions.length; i++){
            int sum = 0;
            for(int j = 0; j < questions[i].length; j++){
                sum += questions[i][j];
            }

            if(sum >= 2){
                count++;
            }
        }

        return count;
    }


}
