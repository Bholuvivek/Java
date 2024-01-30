class Student{
	int rollNo;
	String name;
	
	public Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public String toString(){
		return "RollNo: " + rollNo + " Name: " + name;
	}
	
	public int hashCode(){
		return rollNo;
	}
	
	public static void main(String [] args){
		Student s1 = new Student(101,"Stuti");
		System.out.println(s1);
		//String hash_s1 = String.valueOf(s1.hashCode());
		//System.out.println(Integer.toHexString(s1.hashCode()));
		System.out.println(s1.hashCode());
	}
}