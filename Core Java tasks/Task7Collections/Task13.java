package Task7;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task13 {
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
        int startIndex = 2;
        ListIterator<Integer> iterator = list.listIterator(startIndex);
        System.out.println("Iterating from position " + startIndex + ":");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
     }
    }
}
