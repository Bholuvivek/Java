import java.util.ArrayList;

class WrappeDemo4{
	public static void main(String [] args){
		ArrayList <Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(10);
		myNumbers.add(20);
		myNumbers.add(30);
		myNumbers.add(40);
		
		for (int ele:myNumbers)
			System.out.println(ele);
	}
}