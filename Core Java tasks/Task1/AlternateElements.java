package Task1;
import java.util.ArrayList;
public class AlternateElements {
    public static void main(String[] args) {
        int[] arr = {74,56,85,98,35,67,47,82,91,43,36,28};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i+=2)
        {
                list.add(arr[i]);
        }
        System.out.println("The alternate elements in the array are "+list);
    }
}