package List;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1, 8);
        list.add(23);


        list.set(2, 17);

        System.out.println(list);

        // Arrays.addList > this list cannot grow/shrink, we cannot add/remove elements. we can only update element
        List<String> list1 = Arrays.asList("Apple", "Mango", "Banana", "Blue Berry", "Pine Apple");

        // list1.add("Papaya");          not allowed
        list1.set(2, "Papaya");

        System.out.println(list1);


        // List.of > completely immutable list
        List<String> list2 = List.of("Dog", "Cow", "Goat", "Lion");

        // class name of list > all are not same
        System.out.printf("list class name: %s \n", list.getClass().getName());
        System.out.printf("list class name: %s \n", list1.getClass().getName());
        System.out.printf("list class name: %s \n", list2.getClass().getName());


        // removeAll(Collection<> c)
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 8));
        System.out.println("Set: " + set);
        list.removeAll(set);
        System.out.println(list);


    }
}

