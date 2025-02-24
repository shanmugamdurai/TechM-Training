package Task4;

public class ExpHand1 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);
        }
        catch(Exception e) {
            System.out.println("You cannot divide a number by zero");
        }
    }
}
