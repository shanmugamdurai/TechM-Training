package Task1;
import java.util.Scanner;
import java.util.Arrays;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name =sc.next();
        System.out.println("Enter the marks of the student");
        int[] marks = new int[6];
        for(int i=0;i<marks.length;i++) {
            marks[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<marks.length;i++) {
            sum += marks[i];
        }
        System.out.println("Total marks of "+name+" is "+sum);
        double avg = sum/marks.length;
        System.out.println("Average marks of "+name+" is "+avg);
        Arrays.sort(marks);
        System.out.println("The sorted elements are "+Arrays.toString(marks));
        sc.close();
    }
}
