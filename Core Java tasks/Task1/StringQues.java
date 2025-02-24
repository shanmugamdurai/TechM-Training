package Task1;
import java.util.Scanner;
public class StringQues {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string");
       String s= sc.next();
       char[] ch = s.toCharArray();
       for(int i=0;i<ch.length;i++) {
          if(i%2==0) {
            ch[i]=Character.toUpperCase(ch[i]);
          }
       } 
       String res= String.copyValueOf(ch);
       System.out.println("The resulted string is "+res);
       sc.close();
    }
}
