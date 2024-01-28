
class ConstructorCallDemo1 {
	public static void main(String [] args){
		Derived dObj = new Derived(10,20);
		
		dObj.printIJ();
	}
}



class Base{
	protected int i;
	public Base(){
		System.out.println("Base Default Constructor Called");

		i = 15;
	}
	public Base(int i){
		System.out.println("Base Parameterized Constructor Called");
		this.i = i;
	}
	public void printI(){
		System.out.println(i);
	}
}

class Derived extends Base{
	int j;
	
	public Derived(int i, int j){
		super(i);
		System.out.println("Derived Constructor Called");
		this.j = j;
	}
	
	public void printIJ(){
		System.out.println("I:" + i);
		System.out.println("J:" + j);
	}
}
