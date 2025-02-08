package PrimitiveAndReferenceVariable;

public class PrimVar {
    static void modifyValues(int num, int[] arr) {
        num = 50;
        arr[0] = 99; 
    }
    
    public static void main(String[] args) {
        int number = 10;
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println("Before modification:");
        System.out.println("number: " + number);
        System.out.print("array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        modifyValues(number, array);
        
        System.out.println("\nAfter modification:");
        System.out.println("number: " + number); 
        System.out.print("array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
