class FunctionCallDemo{
	public static void f(){
		System.out.println("Inside F...Before Calling g()");
		g();
		System.out.println("Inside F...After Calling g()");
	}
	
	public static void g(){
		System.out.println("Inside G...Before Calling h()");
		h();
		System.out.println("Inside G...After Calling h()");
	}
	
	public static void h(){
		System.out.println("Inside H...");
	}
	
	public static void main(String [] args){
		System.out.println("Inside Main...Before Calling f()");
		f();
		System.out.println("Inside Main...After Calling f()");
	}
}
	

		