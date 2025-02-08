package PrimitiveAndReferenceVariable.Utility;

public class IntLength {
    public static int getIntegerLength(int number) {
        if (number == 0) {
            return 1;
        }
        int length = 0;
        while (number != 0) {
            number  /= 10;
            length++;
        }
        return length;
    }
}
