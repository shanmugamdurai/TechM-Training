package Task7;

import java.util.LinkedList;
import java.util.Scanner;

public class Task19 {
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
        System.out.println("Enter the index where the element is to be added :");
        int a = sc.nextInt();
        list.add(a,66);
        System.out.println("Updated LinkedList: " + list);
        sc.close();
    }
}
