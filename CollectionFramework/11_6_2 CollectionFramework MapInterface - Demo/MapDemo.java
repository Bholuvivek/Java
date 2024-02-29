import java.util.*;
class Student{
	int rollNo;
	String name;
	
	public Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public Student(){}
	
	public String toString(){
		return rollNo + "-->" + name;
	}
}

class MapDemo{
	public static void main(String [] args){
		Student s1 = new Student(101,"Sonal");
		Student s2 = new Student(102,"Parth");
		Student s3 = new Student(103,"Prarthana");
		Student s4 = new Student (104,"Sandeepta");
		
		TreeMap<Integer,Student> college = new TreeMap<Integer, Student>();
		college.put(3,s3);
		college.put(2,s2);
		college.put(1,s1);
		
		for(int i=0;i<college.size();i++){
			Student s;
			s = college.get(i+1);
			System.out.println(s);
		}
		//Set college_keys = college.keySet();
		
		System.out.println("All The Keys are:" + college.keySet());
		System.out.println("All the Values are:" + college.values());
		
		college.put(4,s4);
		
		System.out.println(college);
		System.out.println("TailMap: " + college.tailMap(2));
		Set<Map.Entry<Integer,Student>> entries_college = college.entrySet();
		
		Iterator<Map.Entry<Integer,Student>> iter = entries_college.iterator();
		
		while(iter.hasNext()){
			Map.Entry<Integer, Student> kvpair = iter.next();
			Integer iKey = kvpair.getKey();
			Student s = kvpair.getValue();
			System.out.println(iKey + "-----" + s);
		}
		System.out.println("Is Map Empty? " + college.isEmpty());
	}
}
			