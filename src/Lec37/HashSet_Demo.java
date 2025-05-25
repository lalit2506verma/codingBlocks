package Lec37;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(-21);
        set.add(9);
        set.add(21);

        System.out.println(set);

//        //get
//        System.out.println(set.contains(9));
//        //remove
//        System.out.println(set.remove(9));
//        System.out.println(set);

        TreeSet<Integer> set1 = new TreeSet<>();

        // add
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(-21);
        set1.add(9);
        set1.add(21);

        System.out.println(set1);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        // add
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(-21);
        set2.add(9);
        set2.add(21);

        System.out.println(set1);
    }
}
