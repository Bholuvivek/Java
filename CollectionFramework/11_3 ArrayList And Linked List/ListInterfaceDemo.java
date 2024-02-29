import java.util.*;

class Student{
	int rollNo;
	String name;
	
	public Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	public String toString(){
		return rollNo + "--> " + name;
	}
	public Student(){}
}

class ListInterfaceDemo{
	static Student [] arr = new Student[10];
	static Student s;
	
	public static void main(String [] args){
		int i;
		LinkedList<Student>  tab1 = new <Student>LinkedList();
		getData(arr);
		for(i = 0;i<10;i++)
			tab1.add(arr[i]);
		for (i = 0;i<10;i++)
			System.out.println(tab1.get(i));
		tab1.add(5, new Student(11,"Darshan"));
		
		System.out.println(tab1);
		
		Iterator iter = tab1.iterator();
		
		System.out.println("Traversing With Iterator");
		
		while(iter.hasNext()){
			Student s = (Student) iter.next();
			System.out.println(s);
		}
		
		Student [] obj1 = new Student[5];
		Student [] obj2 = (Student []) tab1.toArray(obj1);
		
		if (obj1 == obj2)
			System.out.println("Obj1 and Obj2 are same");
		else
			System.out.println("Obj1 and Obj2 are not same");
		
		List<Student> subLi = tab1.subList(2,5);
		ListIterator<Student> li = subLi.listIterator();
		
		System.out.println("Forward Traversal of SubList");
		
		while(li.hasNext()){
			Student s = li.next();
			System.out.println(s);
		}
		//System.out.println("Backward Traversal of SubList");
		
		while(li.hasPrevious()){
			Student s = li.previous();
			if (s.rollNo == 4)
				li.remove();	
		}
		System.out.println(subLi);
		tab1.remove(8);
		System.out.println(tab1);

		
		
	}
	
	static void getData(Student [] A){
		A[0] = new Student(1,"Kena");
		A[1] = new Student(2,"Gopi");
		A[2] = new Student(3,"Nilesh");
		A[3] = new Student(4,"Shivani");
		A[4] = new Student(5,"Mayur");
		A[5] = new Student(6,"Devanshi");
		A[6] = new Student(7,"Faizal");
		A[7] = new Student(8,"Geeta");
		A[8] = new Student(9,"Preksa");
		A[9] = new Student(10,"Prakash");
	}
}
		