import java.util.Scanner;
class InvalidRollNoException extends RuntimeException{
	public String toString(){
		return "Roll Number should be of range 1 to 75";
	}
}

class Student{
	int rollNo;
	String name;
	
	public Student(int rollNo, String name){
		try{
			if ((rollNo <= 0) || (rollNo > 75))
				throw new  InvalidRollNoException();
			this.rollNo = rollNo;
			this.name = name;
		}
		catch(InvalidRollNoException ire){
			System.out.println(ire);
		}
	}
	
	public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter RollNo and Name");
			int r = sc.nextInt();
			String nm = sc.next();
		
			Student s = new Student(r,nm);
				
			System.out.println("One Object is Created");
	}
}
			