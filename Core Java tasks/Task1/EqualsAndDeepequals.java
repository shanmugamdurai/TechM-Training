package Task1;
import java.util.Arrays;
public class EqualsAndDeepequals {
    public static void main(String[] args) {
       int[] arr1 ={1,2,3,4,5,6,7,8,9};
       int[] arr2 = {1,2,3,4,5,6,7,8,9};
       int[][] arr3 ={{1,2,3},{4,5,6},{7,8,9}};
       int[][] arr4 ={{1,2,3},{4,5,6},{7,8,9}};
       if(Arrays.equals(arr1,arr2)) {
            System.out.println("Output from equals method");
       }
       if(Arrays.equals(arr3,arr4)) {
        System.out.println("Output from equals method");
       }
       else {
        System.out.println("Equals method can be used to check normal arrays cannot be used to check nested arrays");
       }
       if( Arrays.deepEquals(arr3,arr4) ) {
        System.out.println("DeepEquals method can be used to check nested arrays cannot be used to check normal arrays");
       }

    }
}
