import java.io.IOException;

/*
 * The hourly class is used to demonstrate how much the employee 
 * makes each hour. The salary is used to show how much the employee 
 * has potential to make in the year.
 */

public class HourlyEmployee extends Employee {

	public HourlyEmployee(int empId) throws IOException {
		
		super(empId);
		double pay;
		
		pay = (super.salary / 12.00) / 4.00 / 40.00;
		setPay(pay);
		
		printEmployee();
	}

	
	
}
