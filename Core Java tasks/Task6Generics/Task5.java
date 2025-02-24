package Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
     public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);
        
        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                mergedList.add(list1.get(i));
            }
            if (i < size2) {
                mergedList.add(list2.get(i));
            }
        }
        
        return mergedList;
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        
        List<Integer> mergedList = mergeAlternating(list1, list2);
        System.out.println("Merged List: " + mergedList);
    }

}
