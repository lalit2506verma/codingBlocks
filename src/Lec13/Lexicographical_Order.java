package Lec13;

public class Lexicographical_Order {
    public static void main(String[] args) {
        String s1 = "Komal";
        String s2 = "Kunal";

        System.out.println(compareTo(s1, s2));
    }

    public static int compareTo(String s1, String s2){
        if(s1 == s2){  // check memory address
            return 0;
        }

        int len = Math.min(s1.length(), s2.length());

        for(int i = 0; i < len; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        return s1.length() - s2.length();
    }
}
