package Task7;

import java.util.ArrayList;
import java.util.Collections;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(75);
        list.add(84);
        list.add(91);
        list.add(56);
        list.add(78);
        System.out.println("Original list: " + list);
        ArrayList<Integer> list1 = new ArrayList<>(Collections.nCopies(list.size(), 0));
        Collections.copy(list1, list);
        System.out.println("Copied list: " + list1);
    }
}
