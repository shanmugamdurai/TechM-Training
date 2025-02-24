package Task7;

import java.util.LinkedList;

public class Task20 {
     public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(20);
        list.add(30);
        System.out.println("Original LinkedList: " + list);
        int searchElement = 20;
        int firstOccurrence = list.indexOf(searchElement);
        int lastOccurrence = list.lastIndexOf(searchElement);
        System.out.println("First occurrence of " + searchElement + ": " + firstOccurrence);
        System.out.println("Last occurrence of " + searchElement + ": " + lastOccurrence);
     }
}
