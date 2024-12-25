package Lec1;

public class Odd_even {
    public static void main(String[] args) {
        int n = 239;
        if(n > 285692){
            System.out.println("Hello");
        }

        if(n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


        // Maximum of 2 numbers
        int a = 25;
        int b = 45;

        if(a >= b) System.out.println(a);
        else System.out.println(b);

        // Maximum of three Numbers
        int n1 = 12;
        int n2 = 14;
        int n3 = 18;

        if(n1 > n2 && n1 > n3){
            System.out.println(n1);
        }
        else{
            if(n2 > n3 && n2 > n1){
                System.out.println(n2);
            }
            else {
                System.out.println(n3);
            }
        }

        // Marking codition - Ques
        int m = 57;

        if(m >= 75){
            System.out.println("A");
        }
        else if(m >= 65 && m < 75){
            System.out.println("B");
        }
        else if(m >= 55 && m < 65){
            System.out.println("C");
        }
        else if(m >= 45 && m < 55){
            System.out.println("D");
        }
        else {
            System.out.println("Fail");
        }
    }


}
