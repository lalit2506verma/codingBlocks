package Lec45;

public class Odd_Even {
    public static void main(String[] args) {
        int n = 689;

        if((n & 1) != 0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
