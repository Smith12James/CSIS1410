import java.io.IOException;
import java.lang.StringBuilder;

/*
 * this file is used to implement setters and getters
 */

public class Employee {
	
	String[] arr = null;
	int employeeID;
	String firstName;
	String lastName;
	int age;
	String title;
	private double salary;
	String status;
	int supervisor_id;
	String supervisorName;
	boolean bonus = false;
	String department;
	int insurance;
	String hireDate;
	String hireDateDisp;
	String phone;
	String phoneDisp;
	
	public Employee(int empId) throws IOException {
		
		this.employeeID = empId;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		
		status = status.toLowerCase();
		
		if(status.equals("f")) {
			
			status = "Full Time";
			
		} else if(status.equals("p")) {
			
			status = "Part Time";
			
		} else if(status.equals("c")) {
			
			status = "Commission";
			
		} else if(status.equals("v")) {
			
			status = "Volunteer";
			
		} else {
			
		status = "Unknown";
			
		}
		
		this.status = status;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = Integer.parseInt(age);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSalary(String salary) {
		this.salary = Double.parseDouble(salary);
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = Integer.parseInt(employeeID);
	}
	
	public int getEmployeeID() {
		return employeeID;
	}

	public int getSupervisor_id() {
		return supervisor_id;
	}

	public void setSupervisor_id(String supervisor_id) {
		this.supervisor_id = Integer.parseInt(supervisor_id);
	}

	public boolean isBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		
		boolean temp = false;
		
		if(bonus.equals("1")) {
			temp = true;
		}
		
		this.bonus = temp;
		
		if (this.bonus == true) {
			
			this.salary = (this.salary + 1000.00);
			
		}
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		
		int temp = Integer.parseInt(insurance);
		
		switch(temp) {
		
		case 0 :
			break;
		case 1 :
			this.salary -= 2000;
			break;
		case 2 :
			this.salary -= 1500;
			break;
		case 3 :
			this.salary -= 1000;
			break;
		case 4 :
			this.salary -= 500;
			break;
		}
		
		this.insurance = Integer.parseInt(insurance);
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		
		String temp = "";
		StringBuilder sb1 = new StringBuilder(hireDate);
		StringBuilder sb2 = new StringBuilder();
		sb1.setCharAt(4, '/');
		sb1.setCharAt(7, '/');
		
		temp = sb1.substring(5,8);
		sb2.append(temp);
		temp = sb1.substring(8,10);
		sb2.append(temp);
		temp = "/";
		sb2.append(temp);
		temp = sb1.substring(0,4);
		sb2.append(temp);
		
		this.hireDateDisp = sb2.toString();
		
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		
		String temp = "";
		StringBuilder sb1 = new StringBuilder(phone);
		StringBuilder sb2 = new StringBuilder("(");
		
		temp = sb1.substring(0,3);
		sb2.append(temp);
		temp = ")";
		sb2.append(temp);
		temp = sb1.substring(3,6);
		sb2.append(temp);
		temp = "-";
		sb2.append(temp);
		temp = sb1.substring(6,10);
		sb2.append(temp);
		
		this.phoneDisp = sb2.toString();
		this.phone = phone;
		
	}
	
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

	public void printEmployee() {
		
		System.out.println("Name: " + this.firstName + " " + this.lastName);
		System.out.println("Employee ID: " + this.employeeID);
		System.out.println("Age: " + this.age);
		System.out.println("Title: " + this.title);
		System.out.println("Status: " + this.status);
//		System.out.println(this.salary + "\n" + this.bonus);
		System.out.println("Supervisor: " + this.supervisorName);
		System.out.println("Department: " + this.department);
		System.out.println("Insurance: " + this.insurance);
		System.out.println("Hire Date: " + this.hireDateDisp);
		System.out.println("Phone: " + this.phoneDisp);
		System.out.println("-----------------------------------------------\n");
		
	}
	
	public void getEmployee() throws IOException {
		
		String empId = Integer.toString(this.employeeID);
		EmpData ed1 = new EmpData(empId);
		this.arr = ed1.getArr();
		String supName = ed1.getSup();
		
		setEmployeeID(this.arr[0]);
		setFirstName(this.arr[1]);
		setLastName(this.arr[2]);
		setAge(this.arr[3]);
		setTitle(this.arr[4]);
		setSalary(this.arr[5]);
		setStatus(this.arr[6]);
		setSupervisor_id(this.arr[7]);
		setSupervisorName(supName);
		setBonus(this.arr[8]);
		setDepartment(this.arr[9]);
		setInsurance(this.arr[10]);
		setHireDate(this.arr[11]);
		setPhone(this.arr[12]);
		
		printEmployee();
		
	}

	
	
}
