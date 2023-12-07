class Student{
	int rollNo;
	String name;
	float marks;
	
	void setRollNo(int rn){
		rollNo = rn;
	}
	
	int getRollNo(){
		return rollNo;
	}
	
	void setName(String nm){
		name = nm;
	}
	
	String getName(){
		return name;
	}
	
	void setMarks(float m){
		marks = m;
	}
	
	float getMarks(){
		return marks;
	}

	String getGrade(){
		if (marks < 35)
			return "Fail";
		return "Pass";
	}
	
	public static void main(String args[]){
		Student s;
		s = new Student();
		s.setRollNo(101);
		s.setName("Piyush");
		s.setMarks(45);
		
		System.out.println("RollNo:" + s.getRollNo());
		System.out.println("Name:" + s.getName());
		System.out.println("Marks:" + s.getMarks());
		System.out.println("Grade:" + s.getGrade());
		
		
		Student s1;
		s1 = new Student();
		s1.setRollNo(102);
		s1.setName("Pooja");
		s1.setMarks(85);
		
		System.out.println("RollNo:" + s1.getRollNo());
		System.out.println("Name:" + s1.getName());
		System.out.println("Marks:" + s1.getMarks());
		System.out.println("Grade:" + s1.getGrade());
				
		
	}
}
	
	
	
	