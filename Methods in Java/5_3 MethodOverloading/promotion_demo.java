class PromoteDemo{
	public static void main(String [] args){
		int i_val = 10;
		float f_val = 4.3f;
		//double d_val = 5.6;
		myprint(i_val);
		myprint(f_val);
	}
	
	static void myprint(float val){
		System.out.println("Float Parameter Method Called");
		System.out.println(val);
	}
	/*static void myprint(int val){
		System.out.println("Int Parameter Method Called");
		System.out.println(val);
	}*/
}