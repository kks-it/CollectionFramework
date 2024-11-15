package List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // In java Linked list is backed by doubly linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(15);
        list.add(4);
        list.add(21);
        list.add(11);
        list.add(9);

        list.addFirst(34); // O(1)
        list.addLast(25);  // O(1)


        System.out.println(list.get(3)); // O(n)
        System.out.println(list.getFirst());
        System.out.println(list.getLast());


        list.remove(2);
        list.remove(Integer.valueOf(34));
        list.removeFirst();
        list.removeLast();

        // pass predicate to remove items
        list.removeIf(a -> a % 2 == 0);

        System.out.println(list);
    }
}
