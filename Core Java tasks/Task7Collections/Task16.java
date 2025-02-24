package Task7;

import java.util.LinkedList;

public class Task16 {
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
        list.addFirst(3);
        list.addLast(98);
        System.out.println("Updated LinkedList after adding element at first and last: " + list);
    }
}
