import java.util.*;

class Student implements Comparable{
	int rollNo;
	String name;
	
	public int compareTo(Object O){
		Student s = (Student) O;
		//return name.compareTo(s.name);
		if (this.rollNo == s.rollNo)
			return 0;
		else if (this.rollNo < s.rollNo)
			return -1;
		else
			return 1;
	}
	
	public Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public String toString(){
		return rollNo + "-->" + name;
	}
}

class SortedSetDemo{
	public static void main(String [] args){
		TreeSet<Student> college = new TreeSet<Student>();
		Student s1 = new Student(101,"Reeta");
		Student s2 = new Student(102,"Seeta");
		Student s3 = new Student(103,"Neeta");
		Student s4 = new Student(104,"Meeta");
		Student s5 = new Student(105,"Ariha");
		
		college.add(s3);
		college.add(s1);
		college.add(s5);
		
		System.out.println(college);
		
		college.add(s4);
		college.add(s2);
		System.out.println("After adding two Student");
		System.out.println(college);

		
		/*TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(40);
		ts1.add(60);
		ts1.add(20);
		ts1.add(70);
		ts1.add(10);
		
		System.out.println(ts1);
		
		ts1.add(50);
		ts1.add(45);
		ts1.add(45);

		System.out.println("After Adding 50 and 45");

		System.out.println(ts1);
		
		TreeSet<Integer> header = (TreeSet<Integer>) ts1.headSet(45);
		System.out.println("Printing Header");

		System.out.println(header);
		
		TreeSet<Integer> trailor = (TreeSet<Integer>) ts1.tailSet(45);
		System.out.println("Printing Trailor");

		System.out.println(trailor);
		
		System.out.println("Printing First");

		System.out.println(ts1.first());
		
		System.out.println("Printing Last");
		System.out.println(ts1.last());*/


	}
}