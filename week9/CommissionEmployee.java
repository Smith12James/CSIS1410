import java.io.IOException;

/*
 * The commission class is used to show that the employee is paid
 * twice a month for his commission upon meeting expectations.
 */

public class CommissionEmployee extends Employee {
	
	public CommissionEmployee(int empId) throws IOException {
		
		super(empId);
		double pay;
		
		pay = (super.salary / 12) / 2;
		setPay(pay);
		
		printEmployee();
		
	}

}