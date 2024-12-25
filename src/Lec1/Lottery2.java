package Lec1;

public class Lottery2 {
    public static void main(String[] args) {
        int n = 89;

        if(n >= 15 && n <= 20){
            System.out.println("Bike");
            if(n >= 15 && n <= 18){
                System.out.println("Splender");
            }
            else{
                System.out.println("Hero");
            }
        }
        else if(n >=50 && n <= 80){
            System.out.println("Cycle");
            if(n >= 50 && n <= 75){
                System.out.println("Hero");
            }
            else{
                System.out.println("Automatic Cycle");
            }
        }
        else if(n >= 100 && n <= 200){
            System.out.println("Car");
            if(n >= 100 && n <= 130){
                System.out.println("Thar");
            }
            else {
                System.out.println("Creta");
            }
        }
        else if(n >= 250 && n <= 300){
            System.out.println("Mac");
            if(n >= 250 && n <= 290){
                System.out.println("M1");
            }
            else{
                System.out.println("M2");
            }
        }
        else if (n >= 1200 && n <= 1400){
            System.out.println("Kurkure");
            if(n >= 120 && n <= 1300){
                System.out.println("Red Kurkure");
            }
            else{
                System.out.println("Kurkure");
            }
        }
        else{
            System.out.println("Better Luck Next time");
        }
    }
}
