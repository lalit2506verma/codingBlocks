package Lec45;

public class Set_UnSet {
    public static void main(String[] args) {
        int n = 84;
        int i = 3;

        if(Set_Unset(n, i)){
            System.out.println("Set");
        }
        else{
            System.out.println("Unset");
        }
    }

    public static boolean Set_Unset(int n, int i){
        int mask = (1 << i);

        if((n & mask) == 0){
            return false;
        }

        return true;
    }
}
