abstract class FinalClass{
	public FinalClass(){
		System.out.println("FinalClass Instantiated");
	}
	abstract final public void f(){
		System.out.println("F() Called...");
	}
}

class DerviedFinalClass extends FinalClass{
	final public void f(){
		System.out.println("F() of Devired Called...");
	}
}


class AbstractFinalDemo{
	public static void main(String [] args){
		//FinalClass obj = new FinalClass();
		//obj.f();
	}
}