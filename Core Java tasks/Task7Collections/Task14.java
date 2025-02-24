package Task7;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task14 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(21);
        list.add(39);
        list.add(15);
        list.add(22);
        list.add(76);
        list.add(56);
        System.out.println("Original LinkedList: " + list);
        ListIterator<Integer> iterator = list.listIterator(list.size());
        System.out.println("Iterating in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
     }
    }

