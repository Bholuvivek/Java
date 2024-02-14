interface I1{
	void f();
	
}

abstract class AbBase{
	abstract void h();
	public AbBase(){
		System.out.println("AbBase Created");
	}
}

class Derived extends AbBase implements I1{
	public void f(){
		System.out.println("F called");
	}
	
	void h(){
		System.out.println("H called");
	}
	
	public static void main(String[] args){
		I1 obj1 = new Derived();
		AbBase obj2 = new Derived();
		Derived obj3 = new Derived();
		((I1)obj2).f();
		obj2.h();
		obj3.f();
		obj3.h();
	}
}
