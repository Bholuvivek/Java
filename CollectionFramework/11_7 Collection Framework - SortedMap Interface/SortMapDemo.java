import java.util.*;

class Student implements Comparable{
	int rollNo;
	String name;
	
	public int compareTo(Object O){
		Student s = (Student) O;
		return name.compareTo(s.name);
	}
	
	public Student(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public Student (){}
	
	public String toString(){
		return rollNo + "-->" + name;
	}
}


		
class SortedMapDemo{
	public static void main(String [] args){
		SortedMap<Student,Integer> sm = new TreeMap<>();
		Student s1 = new Student(101,"Rupal");
		Student s2 = new Student(102,"Nancy");
		Student s3 = new Student(103,"Akshay");
		Student s4 = new Student(104,"Parth");
		Student s5 = new Student(105,"Stuti");
		sm.put(s1,45);
		sm.put(s2,43);
		sm.put(s3,49);
		sm.put(s4,43);
		sm.put(s5,42);
		
		System.out.println(sm);
		
		/*System.out.println("Tail Elements:" + sm.tailMap("Pooja"));
		System.out.println("Head Elements:" + sm.headMap("Pooja"));
		System.out.println("The First Key is:" + sm.firstKey());
		System.out.println("The last Key is:" + sm.lastKey());*/
		
	}
}