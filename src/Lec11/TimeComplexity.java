package Lec11;

public class TimeComplexity {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
