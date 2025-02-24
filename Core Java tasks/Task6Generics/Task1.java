package Task6;

import java.util.Arrays;

public class Task1 {
     public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        Integer[] intArray3 = {1, 2, 3, 4, 6};
        
        String[] strArray1 = {"hello", "world"};
        String[] strArray2 = {"hello", "world"};
        String[] strArray3 = {"hello", "java"};
        
        System.out.println("intArray1 and intArray2 are equal: " + areArraysEqual(intArray1, intArray2));
        System.out.println("intArray1 and intArray3 are equal: " + areArraysEqual(intArray1, intArray3));
        System.out.println("strArray1 and strArray2 are equal: " + areArraysEqual(strArray1, strArray2));
        System.out.println("strArray1 and strArray3 are equal: " + areArraysEqual(strArray1, strArray3));
    }
}
