class Name{
	String firstname;
	public Name(String fnm){
		firstname = fnm;
	}
	
	public void setName(String fnm){
		firstname = fnm;
	}
	
	public String toString(){
			return firstname;
	}
}

class Student implements Cloneable{
	int rollNo;
	Name studName;
	
	Student(int rollNo, String fnm){
		this.rollNo = rollNo;
		this.studName = new Name(fnm);
	}
	
	public void setStudName(String fnm){
		this.studName.setName(fnm);
	}
	
	public Object clone() throws CloneNotSupportedException{
		Student temp = (Student) super.clone();
		temp.studName = new Name(this.studName.firstname);
		return temp;
	}
	
	public static void main(String args[]){
		try{
			Student s1 = new Student(101,"Stuti");
			
			Student s2 = (Student) s1.clone();
			System.out.println(s1.rollNo + " " + s1.studName);
			System.out.println(s2.rollNo + " " + s2.studName);
			
			s2.rollNo = 102;
			s2.setStudName("Stavan");
			
			System.out.println(s1.rollNo + " " + s1.studName);
			System.out.println(s2.rollNo + " " + s2.studName);
		}
		catch(CloneNotSupportedException ce){
			System.out.println(ce);
		}
	}
}