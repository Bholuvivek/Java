class AccessModifierDemo{
	public static void main(String [] args){
		Student s = new Student();
		s.setRollNo(176);
		//s.rollNo = 101;
		s.setName("Ritesh");
		
		System.out.println("RollNo:" + s.getRollNo());
		System.out.println("Name:" + s.getName());
	}
}


class Student{
	private int rollNo;
	private String name;
	
	public void setRollNo(int r){
		if ((r >= 101) && (r <=170))
			rollNo = r;
		else{
			rollNo = 0;
			System.out.println("Roll Number is not within the Range");
		}
	}
	
	public int getRollNo(){
		return rollNo;
	}
	
	public void setName(String nm){
		name = nm;
	}
	
	public String getName(){
		return name;
	}
}