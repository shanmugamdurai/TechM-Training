package Task7;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(75);
        list.add(84);
        list.add(91);
        list.add(56);
        list.add(78); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int el =sc.nextInt();
        if (list.contains(el)) {
            System.out.println("Element '" + el + "' found at index: " + list.indexOf(el));
        } else {
            System.out.println("Element '" + el + "' not found in the list.");
        }
        sc.close();
    }

}
