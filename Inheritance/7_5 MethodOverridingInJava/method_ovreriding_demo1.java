class Base{
	public Base(){
		System.out.println("Base Created");
		}
	protected void print(){
		System.out.println("Hello From Base");
	}
}

class Derived extends Base{
	public Derived(){
		System.out.println("Derived Created");
		}
	protected void print(){
		System.out.println("Hello From Derived");
	}
}

class MethodOverridingDemo1{
	public static void main(String [] args){
		Base b = new Derived();
		
		b.print();
		
	}
}