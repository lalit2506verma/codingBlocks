package Lec1;

public class Kurkure_concept {
    public static void main(String[] args) {
        int n = 89;

        if(n >= 15 && n <= 20){
            System.out.println("Bike");
        }
        else if(n >=50 && n <= 80){
            System.out.println("Cycle");
        }
        else if(n >= 100 && n <= 200){
            System.out.println("Car");
        }
        else if(n >= 250 && n <= 300){
            System.out.println("Mac");
        }
        else if (n >= 1200 && n <= 1400){
            System.out.println("Kurkure");
        }
        else{
            System.out.println("Better Luck Next time");
        }
    }
}