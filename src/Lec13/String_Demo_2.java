package Lec13;

public class String_Demo_2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        s1 = s1 + "Bye"; // s1.concat("Bye")

        System.out.println(s1);
        String s5 = "Hello" + "Hey"; // create in StringPool
        System.out.println(s1.length()); // method

        int[] arr = new int[4];
        System.out.println(arr.length); // variable
    }

}
