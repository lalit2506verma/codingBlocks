package Lec4;

public class PrimeFactor {
    public static void main(String[] args) {
        int n = 756;
        int i = 2;
        while(i <= n){
            if(n % i == 0){
                System.out.println(i);
                n /= i;
            }
            else{
                i++;
            }
        }
    }
}
