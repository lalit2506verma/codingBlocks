package Lec16;

public class count_SubSequence {
    public static void main(String[] args) {
        String s= "abc";
        System.out.println("\n" + print(s, ""));
        //System.out.println(c);
    }

    //static int c = 0;

    private static int print(String s, String ans) {
        if(s.length() == 0){
            System.out.print(ans + " ");
            //c++;
            return 1;
        }

        char ch = s.charAt(0);
        int a = print(s.substring(1), ans);
        int b = print(s.substring(1), ans+ch);

        return a+b;
    }
}
