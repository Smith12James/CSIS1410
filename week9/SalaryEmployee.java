import java.io.IOException;

/*
 * The salary class is used to demonstrate how much the employee 
 * will make on a monthly basis, based on what their salary is.
 */

public class SalaryEmployee extends Employee {

	public SalaryEmployee(int empId) throws IOException {
		
		super(empId);
		double pay;
		
		pay = this.salary/12.00;
		setPay(pay);
		
		printEmployee();
		
	}

}
