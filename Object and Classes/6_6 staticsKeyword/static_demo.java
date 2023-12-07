class Student{
	int rollNo;
	static int passingMarks;
	float marks;

	public static void setPassingMarks(int pm){
		passingMarks = pm;
			
	}
	
	public void set(int rollNo, float marks){
		this.rollNo = rollNo;
		this.marks = marks;
		 
	}
	
	public void display(){
		System.out.println("RollNo: " + rollNo);
		System.out.println("marks: " + marks);
		if (marks < passingMarks)
			System.out.println("Grade : Fail");
		else
			System.out.println("Grade : Pass");
	}
}
class StaticDemo{
	
	public static void main(String [] args){
		Student.setPassingMarks(40);
		
		Student s1 = new Student();
		Student s2 = new Student();

		s1.set(101, 49);
		s2.set(102, 22);
		s1.display();
		s2.display();
	}
}