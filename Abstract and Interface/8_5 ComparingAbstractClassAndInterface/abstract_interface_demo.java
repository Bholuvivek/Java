class Base{}

abstract class AbDemo{
	int var1;
	final int var2 = 10;
	void f(){
		var1++;
		System.out.println("F from AbDemo");
	}
	
	abstract void g();
}

interface I1{
	int var3 = 4;
	final int var4 = 5;
	default void h(){
		System.out.println("H From I");
		var3++;
	}
	
	//abstract void j();
}

interface I2{}

class Dervied extends Base implements I1{}