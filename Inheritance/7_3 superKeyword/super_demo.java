class SuperDemo{
	public static void main(String [] args){
		Derived obj = new Derived();
		obj.printIJ();
	}
}

class Base{
	private int i;
	Base(){
		i = 10;
	}
	public void printI(){
		System.out.println(i);
	}
}

class Derived extends Base{
	private int j;
	Derived(){
		super.i = 20;
		//super();
		this.j = 30;
	}
	public void printIJ(){
		super.printI();
		System.out.println(j);
	}
}