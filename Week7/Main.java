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
		
//		EmpData ed1 = new EmpData("2");
		Employee e1 = new Employee(empId);
		e1.getEmployee();
		
		/*
		 * below is to run the employee ID manually and set it without user input
		 */
		
//		EmpData e2 = new Employee("1");
//		e2.getEmployee();
		
		/*
		 * These are previous examples that were used to start the program
		 */
		
//		String[] arr = null;
//		EmpData ed1 = new EmpData("2");
//		arr = ed1.getArr();
//		System.out.print(arr[1]);

//		Employee e1 = new Employee(123456);
//		Employee e2 = new Employee(654321);
//		Employee e3 = new Employee(987654);
		
//		e1.setFirstName("Bugs");
//		e1.setLastName("Bunny");
//		e1.setAge(82);
//		e1.setTitle("CEO");
//		e1.setStatus("f");
		
//		String bugs = e1.getLastName();
//		System.out.print(bugs);
//		
//		e2.setFirstName("Daffy");
//		e2.setLastName("Duck");
//		e1.setAge(80);
//		e1.setTitle("CTO");
//		e2.setStatus("p");
//		
//		e3.setFirstName("Mickey");
//		e3.setLastName("Mouse");
//		e3.setAge(89);
//		e3.setTitle("Salesmouse");
//		e3.setStatus("c");
//		
//		e1.printEmployee();
//		e2.printEmployee();
//		e3.printEmployee();
		
	}

}
