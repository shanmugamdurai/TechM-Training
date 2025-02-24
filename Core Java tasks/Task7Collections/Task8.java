package Task7;

import java.util.ArrayList;
import java.util.Collections;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(75);
        list.add(84);
        list.add(91);
        list.add(56);
        list.add(78);
        System.out.println("Original list: "+list);
        Collections.sort(list);
        System.out.println("Sorted list: "+list);
    }
}
