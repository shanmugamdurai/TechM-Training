package Task7;

import java.util.ArrayList;
import java.util.Collections;

public class Task10 {
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(75);
        list.add(84);
        list.add(91);
        list.add(56);
        list.add(78);
        System.out.println("Original list: "+list);
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
     }
}
