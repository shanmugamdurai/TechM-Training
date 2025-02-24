package Task2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id ");
        int id = sc.nextInt();
        System.out.println("Enter employee name ");
        String name = sc.next();
        System.out.println("Enter employee's salary");
        double sal = sc.nextDouble();
        System.out.println("Enter employee's experience ");
        int exp = sc.nextInt();
        emp.setEmployeeDetails(id, name, sal);
        emp.getEmployeeDetails();
        if(exp>5) {
            emp.getLoanEligibility();
        }
        else {
            System.out.println("Not Eligible for loan");
        }
        sc.close();
    }
}
