final class Base{
	abstract public void f();
	final public void g(){
		System.out.println("G Called...");
	}
	
	public void h(){
		System.out.println("H From Base is Called...");
	}
}

/*class Derived extends Base{
	public void f(){
		System.out.println("F Called..");
	}
	
	public void h(){
		System.out.println("H from Derived Called..");
		}
}*/

class AbstractFinalDemo{
	public static void main(String [] args){
		/*Derived obj = new Derived();
		obj.f();
		obj.g();
		obj.h();*/
	}
}
		
		

