package Lec14;

import java.sql.SQLOutput;

public class Wrapper_Class_Demo {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 7;
        System.out.println(a);
        System.out.println(a1);  // print content using toString data type

        long l = 9;
        Long l1 = 19l;

        int  b = 11;

        // Auto Boxing
        Integer x = b;  // assigning primitive data type to its corresponding wrapper class is called auto boxing

        // Unboxing
        int c = x;  // assigning wrapper class data to its corresponding primitive data type is called unboxing

        Integer c1 = 90;
        Integer c2 = 90;
        Integer c3 = 190;
        Integer c4 = 190;

        System.out.println(c1 == c2); // true
        System.out.println(c3 == c4); // false -> outside the range

        // Answer
        // Cache concept is there in Java which is having array having size 256 (-128 to 127) so if there is any number or object
        // having number more than this range then caching will not work

    }
}
