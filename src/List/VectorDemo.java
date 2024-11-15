package List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Constructors
        Vector<Integer> v1 = new Vector<>();    // null, default initial capacity = 10, default capacity increment = initial capacity
        Vector<Integer> v2 = new Vector<>(5);    // initial capacity = 5,  default capacity increment = initial capacity
        Vector<Integer> v3 = new Vector<>(5, 3);    //  initial capacity = 5,   capacity increment = 3

        System.out.println("v1 capacity: " + v1.capacity());
        System.out.println("v3 capacity: " + v3.capacity());
        Set<Integer> set = new HashSet<>(Arrays.asList(9, 7, 3));

        Vector<Integer> v4 = new Vector<>(set);
        System.out.println("v4 --> " + v4);

        System.out.println(v2.capacity());
        v2.add(5);
        v2.add(25);
        v2.add(25);
        v2.add(25);
        v2.add(25);
        v2.add(25);
        System.out.println(v2.capacity());
        System.out.println("-----------------");


    }
}
