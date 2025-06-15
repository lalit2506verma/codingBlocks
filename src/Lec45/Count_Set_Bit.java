package Lec45;

public class Count_Set_Bit {
    public static void main(String[] args) {

    }

    public static int fast_Count_SetBit(int n){
        int c = 0;
        while(n > 0){
            n = (n & (n-1));
        }
        return c;
    }

    public static int Count_SetBit(int n){
        int c = 0;
        while(n > 0){
            if((n & 1) != 0){
                c++;
            }
            n >>= 1;
        }
        return c;
    }
}
