import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/*
 * this file is used to use the .csv file and import the data into an array
 * to be used in the Employee file
 */

public class EmpData {
	
	String[] arr = null;
	String empId;
	String supervisorId = "";
	String supervisor = "";
	boolean found = false;
	
	public EmpData(String empId) throws IOException {
		
		File employeeData = new File ("src/EmployeeData.csv");
		
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		this.empId = empId;
		
		br = new BufferedReader(new FileReader(employeeData));
		
		if (employeeData.exists()) {
			
			/*
			 * this while loop is used to loop through the .csv file find the correct employee
			 * and enter that info into
			 */
			
			while((line = br.readLine()) != null) {
				
				this.arr = line.split(cvsSplitBy);
				int comparison1 = Integer.parseInt(arr[0]);
				int comparison2 = Integer.parseInt(empId);
				
				if (comparison1 == comparison2) {
					
					this.supervisorId = arr[7];
//					System.out.println(this.supervisorId);
					this.found = true;
					break;
					
				}
				
			}
			
			br.close();
			
			if(!this.found) {
				
				System.out.println("Employee not found, please try again");
				System.exit(0);
				
			}
			
		}
		
	}
	
	public void sup() throws NumberFormatException, IOException {
		
		/*
		 * this section is a duplicate, however I found it more efficient and easier
		 * to create another method that did a similar concept to the first however this one
		 * is only designed to assign the supervisor variable.
		 */
		
		File employeeData = new File ("src/EmployeeData.csv");
		
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		br = new BufferedReader(new FileReader(employeeData));
		
		if (employeeData.exists()) {
			
			while((line = br.readLine()) != null) {
				
				this.arr = line.split(cvsSplitBy);
				int comparison1 = Integer.parseInt(arr[0]);
				int comparison2 = Integer.parseInt(this.supervisorId);
				
				if (comparison1 == comparison2) {
					
					this.supervisor = (arr[1] + " " + arr[2]);
//					System.out.println(this.supervisorId);
					this.found = true;
					break;
					
				}
				
			}
			
		}
		
		br.close();
		
	}

	public String[] getArr() {
		
		return this.arr;
		
	}
	
	public String getSup() throws NumberFormatException, IOException {
		
		sup();
		return this.supervisor;
		
	}
	
}
