package Task7;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(75);
        list.add(84);
        list.add(91);
        list.add(56);
        list.add(78);
        System.out.println("List before adding the element " + list);
        list.add(1, 33);
        System.out.println("List after adding the element in first index position " + list);

    }
}