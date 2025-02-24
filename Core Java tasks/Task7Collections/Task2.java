package Task7;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(75);
        list.add(84);
        list.add(91);
        list.add(56);
        list.add(78);
        System.out.println("Iterating through all the elements in the list");
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
