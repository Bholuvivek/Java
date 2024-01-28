class ConstructorCallDemo2{
	public static void main(String [] args){
		C cObj = new C(10);
	}
}


class A{
	public A(int i){
		i = 10;
		System.out.println("A Constructor Called");
	}
}

class B extends A{
	public B(int j){
		j = 10;
		super(10);
		System.out.println("B Constructor Called");
	}
}

class C extends B{
	public C(int k){
		super(10);
		k = 10;
		System.out.println("C Constructor Called");
	}
}
