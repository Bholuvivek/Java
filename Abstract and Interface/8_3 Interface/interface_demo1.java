interface I1{
	int no = 10;
	void f();
}

interface I2{
	int no2 = 20;
	void g();
}

interface I3 extends I1,I2{
}


class Base{
	//int no3;
	void h(){
		System.out.println("H Called...");
	}
}


class Demo extends Base implements I3{
	public void f(){
		//no = no + 1;
		System.out.println("F called..:" + no);
	}
	
	public void g(){
		//no = no + 1;
		System.out.println("G called..:" + no2);
	}
	
	
	public static void main(String [] args){
		Demo obj = new Demo();
		obj.f();
		obj.g();
		obj.h();
	}
}