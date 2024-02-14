interface I{
	static void f(){
		System.out.println("F called");
	}
	
	
}

class Demo implements I{
	/*public void f(){
		System.out.println("F called from Demo");
	}*/
	public static void main(String [] args){
		I.f();
	}
}