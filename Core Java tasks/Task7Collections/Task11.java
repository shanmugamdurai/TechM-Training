package Task7;

import java.util.LinkedList;

public class Task11 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(21);
        list.add(39);
        list.add(15);
        System.out.println("Original LinkedList: " + list);
        list.addLast(36);
        System.out.println("LinkedList after adding an element at the lat position " + list);
    }
}
