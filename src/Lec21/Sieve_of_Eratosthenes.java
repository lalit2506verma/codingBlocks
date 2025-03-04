package Lec21;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n = 101;
    }

    public static int PrimeSieve(int n){
        int[] prime = new int[n];

        prime[0] = 1;
        prime[1] = 1;

        for (int i = 2; i*i < prime.length ; i++) {
            if(prime[i] == 0){
                for (int j = 2; i*j < prime.length; j++) {
                    prime[i*j] = 1;
                }
            }
        }
        int c = 0;
        for (int j : prime) {
            if (j == 0) {
                c++;
            }
        }
        return c;
    }

}

