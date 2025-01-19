package Lec14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        System.out.println(ll);
        ll.add(10); // O(1)
        ll.add(20);
        ll.add(1);
        ll.add(1);
        ll.add(-9);
        ll.add(1, 11); // O(N)
        System.out.println(ll.size());
        System.out.println(ll);

        // get
        System.out.println(ll.get(2)); // O(1);

        //remove
        System.out.println(ll.remove(1)); // O(N);

        //update
        ll.set(1, -20);
        System.out.println(ll);

        Collections.sort(ll);
        System.out.println(ll);

        Collections.reverse(ll);
        System.out.println(ll);
    }
}
