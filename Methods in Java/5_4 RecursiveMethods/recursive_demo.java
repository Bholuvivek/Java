class RecursiveDemo{
	static int count = 0;
	public static void main(String [] args){
		p_finite();
	}
	
	/*static void p(){
		System.out.println("Hello");
		p();*/
	
	static void p_finite(){
		count ++;
		if (count <= 100){
			System.out.println("Hello: " + count);
			p_finite();
		}
	}			
}