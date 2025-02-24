package Task7;

import java.util.LinkedList;

public class Task12 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(21);
        list.add(39);
        list.add(15);
        System.out.println("Iterating through all the elements in the Linkedlist");
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
