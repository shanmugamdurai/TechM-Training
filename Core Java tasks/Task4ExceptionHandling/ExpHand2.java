package Task4;
import java.util.Scanner;
public class ExpHand2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number: ");
        int num = sc.nextInt();
        try {
              isOdd(num);
        }
        catch(OddException e) {
           System.out.println(e.getMessage());
        }
        sc.close();
    }
    public static void isOdd(int num) throws OddException {
        if(num %2 !=0) {
            throw new OddException("You cannot enter a odd number");
        }
        else {
            System.out.println("This is not a odd number");
        }
    }
}
class OddException extends Exception {
   public OddException(String a) {
      super(a);
   }
}
