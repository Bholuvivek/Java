class InheritanceDemo2{
	public static void main(String [] args){
		Person p1 = new Person();
		Employee e1 = new Employee();
		FullTimeEmployee ft1 = new FullTimeEmployee();
		PartTimeEmployee pt1 = new PartTimeEmployee();
		p1.setPerson("Krupa","Patna");
		e1.setEmployee("Bhavin","Ahmedabad","E204","Finance");
		ft1.setFullTimeEmployee("Aayush","Jaipur","E342","IT",67000);
		pt1.setPartTimeEmployee("Vismay","Alibaug","E126","HR",1500,20);

		
		
		System.out.println("Person.......");
		p1.displayPerson();
		System.out.println("Employee.......");
		e1.displayEmployee();
		System.out.println("Full Time Employee.......");
		ft1.displayFullTimeEmployee();
		System.out.println("Part Time Employee.......");
		pt1.displayPartTimeEmployee();
	}
}
		
		
		
class Person{
	protected String name;
	protected String address;
	
	public void setPerson(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public void displayPerson(){
		System.out.println("Name:" + name);
		System.out.println("Address:" + address);
	}
}

class Employee extends Person{
	protected String empId;
	protected String department;
	
	public void setEmployee(String name, String address, String empId, String department){
		setPerson(name, address);
		this.empId = empId;
		this.department = department;
	}
	
	public void displayEmployee(){
		displayPerson();
		System.out.println("Emp Id:" + empId);
		System.out.println("Department:" + department);
	}
}


class FullTimeEmployee extends Employee{
	double salary;
	
	public void setFullTimeEmployee(String name, String address, String empId, String department, double salary){
		setEmployee(name,address,empId, department);
		this.salary =salary;
	}
	
	public void displayFullTimeEmployee(){
		displayEmployee();
		System.out.println("Salary: Rs." + salary);
	}
}


class PartTimeEmployee extends Employee{
	double perHour;
	int hour;
	
	public void setPartTimeEmployee(String name, String address, String empId, String department, double perHour, int hour){
		setEmployee(name,address,empId, department);
		this.perHour = perHour;
		this.hour = hour;
	}
	
	public void displayPartTimeEmployee(){
		displayEmployee();
		System.out.println("Per Hour:" + perHour);
		System.out.println("Hour:" + hour);
		System.out.println("Wage Given: Rs. " + (perHour * hour));
	}
}