import java.util.Scanner;

public class EmployeeTest {
    /** this is a test class*/
    public static void main( String args[] ){

//we are in the the main

        Employee firstemployee=new Employee();
        Employee secondemployee=new Employee();

        Scanner sc=new Scanner(System.in);
        String first;
        String last;
        double salary;

        System.out.println("Enter First Name of First Employee: ");
        first=sc.next();
        firstemployee.setName(first);

        System.out.println("Enter Last Name of First Employee: ");
        last=sc.next();
        firstemployee.setLastname(last);

        System.out.println( "Enter Monthly Salary of First Employee: " );
        salary=sc.nextDouble();
        firstemployee.setSalary(salary);

        System.out.println("Enter First Name of Second Employee: ");
        first=sc.next();
        secondemployee.setName(first);

        System.out.println("Enter Last Name of Second Employee: ");
        last=sc.next();
        secondemployee.setLastname(last);

        System.out.println( "Enter Monthly Salary of Second Employee: " );
        salary=sc.nextDouble();
        secondemployee.setSalary(salary);

        System.out.println("First Employee's Full Name and Yearly Salary.\n");
        System.out.println( firstemployee.getName() + " " + firstemployee.getLastname() + "  " + firstemployee.getSalary() * 12 + "\n" );

        System.out.println("Second Employee's Full Name and Yearly Salary.\n");
        System.out.println( secondemployee.getName() + " " + secondemployee.getLastname() + "  " + secondemployee.getSalary() * 12 + "\n" );

        System.out.println("Displaying New Total Annual Salary After 10% Raise.\n");
        System.out.println( firstemployee.getName() + " " + firstemployee.getLastname() + "  " + (firstemployee.getSalary()*1.10 * 12 + "\n"));
        System.out.println( secondemployee.getName() + " " + secondemployee.getLastname() + "  " + (secondemployee.getSalary()*1.10 * 12 + "\n"));
    }


}
