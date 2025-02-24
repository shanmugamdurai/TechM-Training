package Task2;

public class Employee {
    private int empId;
    private String empName;
    private double sal;
    public void setEmployeeDetails(int empId,String empName,double sal) {
         this.empId=empId; 
         this.empName=empName;
         this.sal=sal;
    }
    public void getEmployeeDetails() {
        System.out.println("Employee id is "+empId);
        System.out.println("Employee name is "+empName);
        System.out.println("Salary of "+empName+" is "+sal);
    }
    public void getLoanEligibility() {
        if(sal>=600000 && sal <1000000) {
            System.out.println("2 lakhs of loan is granted");
        }
        else if(sal>=1000000 && sal <1500000) {
            System.out.println("5 lakhs of loan is granted");
        }
        else if(sal>=1500000 ) {
            System.out.println("10 lakhs of loan is granted");
        }
        else {
            System.out.println("Not Eligible for loan");
        }
    }
}
