package Lec14;

import java.util.ArrayList;

public class ArrayList_Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        System.out.println(ll);
        ll.add(10); // O(1)
        ll.add(20);
        ll.add(1);
        ll.add(1);
        ll.add(-9);
        ll.add(1, 11); // O(N)
        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}
