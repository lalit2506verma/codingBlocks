package Lec15;

public class Sum_Of_Number {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(sum(n));
    }

    public static int sum (int n){
        if(n == 0){
            return 0;
        }

        int sum = sum(n-1);

        return sum + n;
    }
}
