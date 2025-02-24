package Task7;

import java.util.LinkedList;
import java.util.Scanner;

public class Task17 {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to be inserted at first :");
        int a = sc.nextInt();
        list.addFirst(a);
        System.out.println("Updated LinkedList: " + list);
        sc.close();
    }
}
