package Lec35;

// Generic Class Example
public class Pair<K, V> {

    K x;
    V y;

    public Pair() {
    }

    public static void main(String[] args) {
        Pair<Integer, Boolean> p = new Pair<>();
        Pair<Long, Character> p1 = new Pair<>();
    }
}
