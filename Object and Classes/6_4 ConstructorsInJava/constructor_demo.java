class ConstructorDemo{
	public static void main(String [] args){
		Student s = new Student(101,45.5f);
		Student s2 = new Student(102);
		Student s1 = new Student();
		s.displayStudent();
		s1.displayStudent();
		s2.displayStudent();


	}
}

class Student{
	private int rollNo;
	private float marks;
	
	public Student(){
		rollNo = 1;
		marks = 50f;
	}
	
	public Student(int r){
		rollNo = r;
		marks = 50f;
	}
	
	public Student(int r, float m){
		rollNo = r;
		marks = m;
	}
	public void displayStudent(){
		System.out.println("RollNo:" + rollNo + " Marks: " + marks);
	}
}
