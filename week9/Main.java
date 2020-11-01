/*
 * @author James
 * 
 * @version 1.2.0
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
	


	public static void main(String[] args) throws IOException {
		
		/*
		 * this section is designed to take user input and use that input to pull employee data
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee ID: ");
		int empId = input.nextInt();
		System.out.println("-----------------------------------------------");
		input.close();
		
		/*
		 * I figured it would be more efficient to call the subclasses from the
		 * superclass. To stay within the guidelines of the assignment I will
		 * call the superclass so that I can correctly fill the array and allow
		 * the status of the employee to determine which subclass will be used.
		 */
		
		Employee e1 = new Employee(empId);
		String stat = e1.getStatus();
		
		if(stat.equals("Full Time")) {
			
			SalaryEmployee se1 = new SalaryEmployee(empId);

		} else if(stat.equals("Part Time")) {
			
			HourlyEmployee he1 = new HourlyEmployee(empId);
			
		} else if(stat.equals("Commission")) {
			
			CommissionEmployee ce1 = new CommissionEmployee(empId);
			
		} else {
			
			e1.setPay(0.00);
			e1.printEmployee();
			
		}
		
//		se1.printEmployee();
		
//		Employee e1 = new Employee(empId);
//		e1.getEmployee();
		
	}

}
