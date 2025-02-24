package Task1;
import java.util.Arrays;
public class ArrayCopyRange {
    public static void main(String[] args) {
        int[] arr = {5,8,7,3,4,2,4,3,6,7};
        System.out.println("Original array is "+Arrays.toString(arr));
        int[] arr1 = Arrays.copyOfRange(arr,2,6);
        System.out.println("Array with original array elements from index 2 to 6 "+Arrays.toString(arr1));
    }
}
