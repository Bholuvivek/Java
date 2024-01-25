class InheritanceDemo1{
	public static void main(String [] args){
		Employee e1 = new Employee();
		FullTimeEmployee ft1 = new FullTimeEmployee();
		e1.setEmployee("E101","Sonal");
		ft1.setFullTimeEmployee("E102","Parth",75000);
		
		e1.printEmployee();
		ft1.printEmployee();
	}
}
class Employee{
	protected String empId;
	protected String empName;
	
	public void setEmployee(String empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	public void printEmployee(){
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + this.empName);
	}
}

class FullTimeEmployee extends Employee{
	private double salary;
	
	public void setFullTimeEmployee(String empId, String empName, double salary){
		//setEmployee(empId, empName);
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void printFullTimeEmployee(){
		printEmployee();
		System.out.println("Employee Salary: " + this.salary);
	}
}


	