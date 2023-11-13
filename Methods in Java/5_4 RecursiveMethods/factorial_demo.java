class FactorialDemo{
	public static void main(String [] args){
		System.out.println("The value is : " + factorial(5));
	}
	
	public static int factorial(int val){
		int ans = 1;
		for (int i = 1;i<=val ; i++)
			ans *= i;
		return ans;
	}
	
	
	
	/*public static int factorial(int val){
		if (val ==1)
			return 1;
		else
			return val * factorial(val-1);
	}*/
}